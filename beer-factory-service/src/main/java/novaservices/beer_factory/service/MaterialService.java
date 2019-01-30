package novaservices.beer_factory.service;

import novaservices.beer_factory.vos.MaterialVO;

public interface MaterialService {
    MaterialVO create(MaterialVO materialVO);

    MaterialVO get(Long id);

    MaterialVO update(MaterialVO materialVO);

}
