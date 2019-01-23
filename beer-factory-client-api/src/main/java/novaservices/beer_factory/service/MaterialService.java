package novaservices.beer_factory.service;

import novaservices.beer_factory.vos.MaterialVO;

public interface MaterialService {
    public MaterialVO create(MaterialVO materialVO);
    public MaterialVO read(MaterialVO materialVO);
    public MaterialVO increaseQuantity(MaterialVO materialVO);
    public MaterialVO reserveQuantity(MaterialVO materialVO);
    public MaterialVO deleteQuantity(MaterialVO materialVO);
    public void delete(MaterialVO materialVO);
}
