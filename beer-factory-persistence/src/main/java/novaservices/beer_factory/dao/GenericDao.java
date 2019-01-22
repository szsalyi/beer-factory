package novaservices.beer_factory.dao;

import novaservices.beer_factory.entities.BaseEntity;

import java.util.List;


public interface GenericDao<T extends BaseEntity> {
    T create(T t);

    T read(T t);

    List<T> readAll(T t);

    T update(T t);

    void delete(T t);
}
