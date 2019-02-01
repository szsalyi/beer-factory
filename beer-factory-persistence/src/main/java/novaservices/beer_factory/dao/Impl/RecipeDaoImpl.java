package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.RecipeDao;
import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.entities.RecipeEntity;
import org.hibernate.dialect.lock.PessimisticEntityLockException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class RecipeDaoImpl implements RecipeDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public RecipeEntity create(RecipeEntity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public RecipeEntity createRecipeBase(RecipeEntity entity) {
       RecipeEntity entityToSave = new RecipeEntity();

        entityToSave.setRecipeName(entity.getRecipeName());
        entityManager.persist(entityToSave);

        return entityToSave;
    }

    @Override
    public RecipeEntity read(Long id) {
        return entityManager.find(RecipeEntity.class, id);
    }

    @Override
    public List<RecipeEntity> readAll() {
        TypedQuery<RecipeEntity> query = entityManager.createNamedQuery(RecipeEntity.FIND_ALL, RecipeEntity.class);
        return query.getResultList();
    }

    @Override
    public RecipeEntity update(RecipeEntity entity) {
        entityManager.merge(entity);
        return entity;
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(id);
    }
}
