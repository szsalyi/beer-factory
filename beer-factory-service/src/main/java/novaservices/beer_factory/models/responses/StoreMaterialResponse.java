package novaservices.beer_factory.models.responses;

import lombok.Data;

@Data
public class StoreMaterialResponse {
    private Long availableQuantity;
    private Long reservedQuantity;
    private Long storedMaterialStatusId;
    private Long storedMaterialId;
    private String storedMaterialName;
}
