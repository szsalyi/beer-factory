package novaservices.beer_factory.models.impl;

import novaservices.beer_factory.dao.GenericDao;
import novaservices.beer_factory.dao.Impl.GenericDaoImpl;
import novaservices.beer_factory.models.mappers.BrewMapper;
import novaservices.beer_factory.service.GenericService;

import javax.inject.Inject;
import java.util.List;

public class GenericServiceImpl<T, D extends GenericDao> implements GenericService<T> {

    @Inject
    private D d;

    @Inject
    private BrewMapper brewMapper;

    @Override
    public T create(T t) {
        return null;
    }

    @Override
    public T read(T t) {
        return null;
    }

    @Override
    public List<T> readAll(T t) {
        return null;
    }

    @Override
    public T update(T t) {
        return null;
    }

    @Override
    public void delete(T t) {

    }
}
