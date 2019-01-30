package novaservices.beer_factory.dao;

import novaservices.beer_factory.entities.MaterialEntity;

public interface MaterialDao {
    MaterialEntity create(MaterialEntity entity);

    MaterialEntity read(Long id);

    MaterialEntity update(MaterialEntity entity);

    MaterialEntity increaseQuantity(MaterialEntity entity);

    MaterialEntity reserveQuantity(MaterialEntity entity);

    MaterialEntity deleteQuantity(MaterialEntity entity);
}
