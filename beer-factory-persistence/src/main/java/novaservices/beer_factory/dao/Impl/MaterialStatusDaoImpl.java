package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.MaterialStatusDao;
import novaservices.beer_factory.entities.MaterialStatusEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

import static novaservices.beer_factory.entities.MaterialStatusEntity.FIND_BY_MATERIAL_ID;

@Stateless
public class MaterialStatusDaoImpl implements MaterialStatusDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public MaterialStatusEntity create(MaterialStatusEntity entity) {
        entityManager.persist(entity);
        return entity;
    }

    @Override
    public MaterialStatusEntity read(Long id) {
        return entityManager.find(MaterialStatusEntity.class, id);
    }

    @Override
    public List<MaterialStatusEntity> readAll(boolean onlyAvailable) {
        TypedQuery<MaterialStatusEntity> query =
                onlyAvailable ?
                        entityManager.createNamedQuery(MaterialStatusEntity.FIND_ALL_AVAILABLE, MaterialStatusEntity.class) :
                        entityManager.createNamedQuery(MaterialStatusEntity.FIND_ALL, MaterialStatusEntity.class);

        return query.getResultList();
    }

    @Override
    public MaterialStatusEntity update(MaterialStatusEntity entity) {
        entityManager.merge(entity);
        return entity;
    }

    @Override
    public void delete(MaterialStatusEntity entity) {

    }

    @Override
    public MaterialStatusEntity readByMaterialId(Long id) {
        TypedQuery<MaterialStatusEntity> query = entityManager.createNamedQuery(FIND_BY_MATERIAL_ID, MaterialStatusEntity.class)
                .setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public MaterialStatusEntity increaseMaterialQuantity(Long id, Long quantity) {
        return null;
    }
}
