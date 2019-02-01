package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.BrewDao;
import novaservices.beer_factory.entities.BrewEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class BrewDaoImpl implements BrewDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public BrewEntity create(BrewEntity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public BrewEntity read(Long id) {
        return entityManager.find(BrewEntity.class, id);
    }

    @Override
    public List<BrewEntity> readAll(BrewEntity entity) {
        TypedQuery<BrewEntity> query = entityManager.createNamedQuery(BrewEntity.FIND_ALL, BrewEntity.class);
        return query.getResultList();
    }

    @Override
    public BrewEntity update(BrewEntity entity) {
        return entityManager.merge(entity);
    }

    @Override
    public void delete(BrewEntity entity) {
        entityManager.remove(entity);
    }
}
