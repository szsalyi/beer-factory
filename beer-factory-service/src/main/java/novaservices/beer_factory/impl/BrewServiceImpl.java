package novaservices.beer_factory.impl;

import novaservices.beer_factory.dao.BrewDao;
import novaservices.beer_factory.dao.MaterialDao;
import novaservices.beer_factory.dao.MaterialStatusDao;
import novaservices.beer_factory.entities.BrewEntity;
import novaservices.beer_factory.entities.RecipeMaterialEntity;
import novaservices.beer_factory.enums.BrewStatus;
import novaservices.beer_factory.models.mappers.BrewMapper;
import novaservices.beer_factory.service.BrewService;
import novaservices.beer_factory.vos.BrewVO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.*;

import static java.util.stream.Collectors.toMap;

@Stateless
public class BrewServiceImpl implements BrewService {

    @Inject
    private BrewDao brewDao;

    @Inject
    private MaterialStatusDao materialStatusDao;

    @Inject
    private MaterialDao materialDao;

    @Inject
    private BrewMapper brewMapper;

    @Override
    public BrewVO planBrew(BrewVO brewVO) {
        BrewEntity createdBrew = brewDao.create(brewMapper.toEntity(brewVO));
        List<Long> materialsNeeded = new ArrayList<>();
        List<Long> materialsOnStore = new ArrayList<>();

        Set<RecipeMaterialEntity> entityVOList = createdBrew.getRecipe().getRecipeMaterial();
        Map<Long, Long> materialIds = entityVOList.stream()
                .map(rm -> new AbstractMap.SimpleEntry<>(rm.getMaterial().getId(), rm.getRequiredQuantity()))
                .collect(toMap(AbstractMap.SimpleEntry::getKey, AbstractMap.SimpleEntry::getValue));

        for (Map.Entry<Long, Long> entry :
                materialIds.entrySet()) {
            if (materialStatusDao.reserveMaterialQuantity(entry.getKey(), entry.getValue())) {
                materialsOnStore.add(entry.getKey());
            } else {
                materialsNeeded.add(entry.getKey());
            }
        }
        
        return brewMapper.toVo(createdBrew);
    }

    @Override
    public void setStatus(BrewStatus status) {

    }
}
