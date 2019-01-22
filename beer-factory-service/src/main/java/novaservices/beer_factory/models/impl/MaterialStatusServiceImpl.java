package novaservices.beer_factory.models.impl;

import novaservices.beer_factory.dao.MaterialStatusDao;
import novaservices.beer_factory.entities.MaterialStatusEntity;
import novaservices.beer_factory.models.mappers.MaterialStatusMapper;
import novaservices.beer_factory.vos.MaterialStatusVO;

import javax.ejb.Stateless;

@Stateless
public class MaterialStatusServiceImpl
        extends GenericServiceImpl<MaterialStatusEntity, MaterialStatusVO, MaterialStatusDao, MaterialStatusMapper> {
}
