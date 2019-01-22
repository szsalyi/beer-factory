package novaservices.beer_factory.service;

import java.util.List;

public interface GenericService<T> {
    T create(T t);

    T read(T t);

    List<T> readAll(T t);

    T update(T t);

    void delete(T t);
}
