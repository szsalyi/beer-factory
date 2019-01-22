package novaservices.beer_factory.service;

import java.util.List;

public interface GenericService<V> {
    V create(V v);

    V read(V v);

    List<V> readAll(V v);

    V update(V v);

    void delete(V v);
}
