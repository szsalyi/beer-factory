package novaservices.beer_factory.models.impl;

import novaservices.beer_factory.dao.MaterialDao;
import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.models.mappers.MaterialMapper;
import novaservices.beer_factory.service.MaterialService;
import novaservices.beer_factory.vos.MaterialVO;

import javax.ejb.Stateless;

@Stateless
public class MaterialServiceImpl extends GenericServiceImpl<MaterialEntity, MaterialVO, MaterialDao, MaterialMapper>
        implements MaterialService {
}
