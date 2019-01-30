package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.BrewDao;
import novaservices.beer_factory.entities.BrewEntity;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BrewDaoImpl implements BrewDao {
    @Override
    public BrewEntity create(BrewEntity entity) {
        return null;
    }

    @Override
    public BrewEntity read(Long id) {
        return null;
    }

    @Override
    public List<BrewEntity> readAll(BrewEntity entity) {
        return null;
    }

    @Override
    public BrewEntity update(BrewEntity entity) {
        return null;
    }

    @Override
    public void delete(BrewEntity entity) {

    }
}
