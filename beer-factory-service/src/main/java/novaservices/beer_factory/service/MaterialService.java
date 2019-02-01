package novaservices.beer_factory.service;

import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.vos.MaterialVO;

import java.util.List;

public interface MaterialService {
    MaterialVO create(MaterialVO materialVO);

    MaterialVO get(Long id);

    MaterialVO update(MaterialVO materialVO);

    void synchronizeMaterials(List<Long> ids);
}
