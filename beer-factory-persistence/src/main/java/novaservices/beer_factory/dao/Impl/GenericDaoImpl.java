package novaservices.beer_factory.dao.Impl;

import lombok.Getter;
import novaservices.beer_factory.dao.GenericDao;
import novaservices.beer_factory.entities.BaseEntity;
import org.hibernate.HibernateException;

import javax.persistence.*;
import java.util.List;


public abstract class GenericDaoImpl<T extends BaseEntity> implements GenericDao<T> {

    @Getter
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public T create(T t) {
        try {
            entityManager.persist(t);
        } catch (HibernateException ignored) {
            return null; /*TODO(SSALYI) : Wrap return object to a Result so no exception is thrown towards.
                         The result object with the error will move through layers*/
        }
        return t;
    }

    @Override
    public T read(T t) {
        return (T) entityManager.find(t.getClass(), t.id);
    }

    @Override
    public List<T> readAll(T t) {
        String findAll = "SELECT t FROM " + t.getClass().getName() + " t";
        TypedQuery query = entityManager.createNamedQuery(findAll, t.getClass());
        return query.getResultList();
    }

    @Override
    public T update(T t) {
        return entityManager.merge(t);
    }

    @Override
    public void delete(T t) {
        entityManager.remove(t);
    }

}
