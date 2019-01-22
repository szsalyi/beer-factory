package novaservices.beer_factory.vos;

import lombok.Data;

@Data
public class MaterialRecipeVO {
    private Long id;
    private Long materialId;
    private Long RecipeId;
    private int requiredQuantity;
}
