package novaservices.beer_factory.dao;

import novaservices.beer_factory.entities.MaterialStatusEntity;

import java.util.List;

public interface MaterialStatusDao {
    MaterialStatusEntity create(MaterialStatusEntity entity);

    MaterialStatusEntity read(Long id);

    List<MaterialStatusEntity> readAll(boolean onlyAvailable);

    MaterialStatusEntity update(MaterialStatusEntity entity);

    void delete(MaterialStatusEntity entity);

    MaterialStatusEntity readByMaterialId(Long id);

    boolean reserveMaterialQuantity(Long materialId, Long quantity);
}
