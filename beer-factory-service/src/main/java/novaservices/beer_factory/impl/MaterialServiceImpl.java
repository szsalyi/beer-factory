package novaservices.beer_factory.impl;

import novaservices.beer_factory.dao.MaterialDao;
import novaservices.beer_factory.dao.MaterialStatusDao;
import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.models.mappers.MaterialMapper;
import novaservices.beer_factory.service.MaterialService;
import novaservices.beer_factory.service.MaterialStatusService;
import novaservices.beer_factory.vos.MaterialVO;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class MaterialServiceImpl implements MaterialService {

    @Inject
    private MaterialDao materialDao;


    @Inject
    private MaterialMapper mapper;

    @Inject
    private MaterialStatusService statusService;

    @Override
    public MaterialVO create(MaterialVO materialVO) {
        MaterialEntity entity = mapper.toEntity(materialVO);
        MaterialEntity savedEntity = materialDao.create(entity);
        return mapper.toVo(savedEntity);
    }

    @Override
    public MaterialVO get(Long id) {
        MaterialEntity materialEntity = materialDao.read(id);
        return mapper.toVo(materialEntity);
    }

    @Override
    public MaterialVO update(MaterialVO materialVO) {
        MaterialEntity materialEntity = materialDao.update(mapper.toEntity(materialVO));
        return mapper.toVo(materialEntity);
    }
}
