package novaservices.beer_factory.service;

import novaservices.beer_factory.vos.MaterialStatusVO;
import novaservices.beer_factory.vos.MaterialVO;

import java.util.List;

public interface MaterialStatusService {
    MaterialStatusVO getMaterialStatus(Long id);

    MaterialStatusVO create(MaterialVO statusVO, Long quantity);

    void delete(MaterialStatusVO statusVO);

    List<MaterialStatusVO> getStoreStatus();
}
