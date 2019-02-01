package novaservices.beer_factory.impl;

import novaservices.beer_factory.dao.MaterialDao;
import novaservices.beer_factory.dao.RecipeMaterialDao;
import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.entities.RecipeMaterialEntity;
import novaservices.beer_factory.models.mappers.RecipeMaterialMapper;
import novaservices.beer_factory.service.RecipeMaterialService;
import novaservices.beer_factory.vos.RecipeMaterialVO;

import javax.inject.Inject;
import java.util.List;

public class RecipeMaterialServiceImpl implements RecipeMaterialService {

    @Inject
    private RecipeMaterialDao recipeMaterialDao;

    @Inject
    private MaterialDao materialDao;
    @Inject
    private RecipeMaterialMapper recipeMapper;

    @Override
    public RecipeMaterialVO create(RecipeMaterialVO recipeMaterialVO) {
        RecipeMaterialEntity entity = recipeMapper.toEntity(recipeMaterialVO);
        MaterialEntity update;
        if (materialDao.read(entity.getMaterial().getId()) == null) {
            update = materialDao.update(entity.getMaterial());
            entity.setMaterial(update);
        }

        entity.getRecipeMaterialPK().setMaterialId(entity.getMaterial().getId());
        recipeMaterialDao.create(entity);

        return recipeMapper.toVo(entity);
    }

    @Override
    public void assignRecipeId(List<RecipeMaterialVO> recipeMaterialVOS) {

    }
}
