package novaservices.beer_factory.models.impl;

import novaservices.beer_factory.dao.GenericDao;
import novaservices.beer_factory.entities.BaseEntity;
import novaservices.beer_factory.models.mappers.GenericMapper;
import novaservices.beer_factory.service.GenericService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public abstract class GenericServiceImpl<E extends BaseEntity, V, D extends GenericDao<E>, M extends GenericMapper<E, V>>
        implements GenericService<V> {

    @Inject
    private D d;

    @Inject
    private M m;

    @Override
    public V create(V v) {
        E entity = (E) d.create(m.toEntity(v));
        return m.toVo(entity);
    }

    @Override
    public V read(V v) {
        E entity = (E) d.read(m.toEntity(v));
        return m.toVo(entity);
    }

    @Override
    public List<V> readAll(V v) {
        return (List<V>) d.readAll(m.toEntity(v))
                .stream()
                .map(e -> m.toVo((E) e))
                .collect(Collectors.toList());
    }

    @Override
    public V update(V v) {
        E entity = (E) d.update(m.toEntity(v));
        return m.toVo(entity);
    }

    @Override
    public void delete(V v) {
        d.delete(m.toEntity(v));
    }
}
