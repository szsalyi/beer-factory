package novaservices.beer_factory.models.responses;

import lombok.Data;
import novaservices.beer_factory.vos.MaterialVO;

@Data
public class StoreMaterialResponse {
    private MaterialVO material;
    private int availableQuantity;
    private int reservedQuantity;
}
