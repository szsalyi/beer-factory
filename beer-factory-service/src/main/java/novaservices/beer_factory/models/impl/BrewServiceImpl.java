package novaservices.beer_factory.models.impl;

import novaservices.beer_factory.dao.BrewDao;
import novaservices.beer_factory.entities.BrewEntity;
import novaservices.beer_factory.models.mappers.BrewMapper;
import novaservices.beer_factory.service.BrewService;
import novaservices.beer_factory.vos.BrewVO;

import javax.ejb.Stateless;

@Stateless
public class BrewServiceImpl extends GenericServiceImpl<BrewEntity, BrewVO, BrewDao, BrewMapper> implements BrewService {
}
