package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.RecipeMaterialDao;
import novaservices.beer_factory.entities.RecipeMaterialEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RecipeMaterialDaoImpl implements RecipeMaterialDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public RecipeMaterialEntity create(RecipeMaterialEntity entity) {
        entityManager.persist(entity);
        return entity;
    }
}
