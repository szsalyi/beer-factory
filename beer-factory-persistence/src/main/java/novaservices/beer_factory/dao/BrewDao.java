package novaservices.beer_factory.dao;

import novaservices.beer_factory.entities.BrewEntity;

import java.util.List;

public interface BrewDao {
    BrewEntity create(BrewEntity entity);

    BrewEntity read(Long id);

    List<BrewEntity> readAll(BrewEntity entity);

    BrewEntity update(BrewEntity entity);

    void delete(BrewEntity entity);
}
