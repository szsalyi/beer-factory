package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.MaterialDao;
import novaservices.beer_factory.entities.MaterialEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MaterialDaoImpl implements MaterialDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public MaterialEntity create(MaterialEntity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public MaterialEntity read(Long id) {
        return entityManager.find(MaterialEntity.class, id);
    }

    @Override
    public MaterialEntity update(MaterialEntity entity) {
        return entityManager.merge(entity);
    }

    @Override
    public MaterialEntity increaseQuantity(MaterialEntity entity) {
        return null;
    }

    @Override
    public MaterialEntity reserveQuantity(MaterialEntity entity) {
        return null;
    }

    @Override
    public MaterialEntity deleteQuantity(MaterialEntity entity) {
        return null;
    }

}