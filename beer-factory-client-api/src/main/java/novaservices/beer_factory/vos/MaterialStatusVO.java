package novaservices.beer_factory.vos;

import lombok.Data;

@Data
public class MaterialStatusVO {
    private Long id;
    private Long materialId;
    private int availableQuantity;
    private int reservedQuantity;
}
