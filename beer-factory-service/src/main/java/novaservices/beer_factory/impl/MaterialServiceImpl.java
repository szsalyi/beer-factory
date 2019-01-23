package novaservices.beer_factory.impl;

import novaservices.beer_factory.mappers.MaterialMapper;
import novaservices.beer_factory.service.MaterialService;
import novaservices.beer_factory.vos.MaterialVO;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class MaterialServiceImpl implements MaterialService {

    @Inject
    private MaterialMapper mapper;

    @Override
    public MaterialVO create(MaterialVO materialVO) {
        //MaterialEntity entity = materialDao.create(mapper.toEntity(materialVO));
        return null; //mapper.toVo(entity);
    }

    @Override
    public MaterialVO read(MaterialVO materialVO) {
        return null;
    }

    @Override
    public MaterialVO increaseQuantity(MaterialVO materialVO) {
        return null;
    }

    @Override
    public MaterialVO reserveQuantity(MaterialVO materialVO) {
        return null;
    }

    @Override
    public MaterialVO deleteQuantity(MaterialVO materialVO) {
        return null;
    }

    @Override
    public void delete(MaterialVO materialVO) {

    }
}
