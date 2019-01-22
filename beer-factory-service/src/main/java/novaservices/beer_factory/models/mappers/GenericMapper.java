package novaservices.beer_factory.models.mappers;

public interface GenericMapper<E, V> {
    V toVo(E e);

    E toEntity(V vo);
}
