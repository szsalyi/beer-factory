package novaservices.beer_factory.mappers;

public interface GenericMapper<E, V> {
    V toVo(E e);

    E toEntity(V vo);
}
