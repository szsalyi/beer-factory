package novaservices.beer_factory.impl;

import novaservices.beer_factory.service.BrewService;
import novaservices.beer_factory.vos.BrewVO;

import javax.ejb.Stateless;

@Stateless
public class BrewServiceImpl implements BrewService {
    @Override
    public BrewVO create(BrewVO brewVO) {
        return null;
    }
}
