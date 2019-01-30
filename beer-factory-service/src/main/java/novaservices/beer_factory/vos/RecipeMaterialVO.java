package novaservices.beer_factory.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecipeMaterialVO {
    private Long id;
    private Long materialId;
    private Long recipeId;
    private int requiredQuantity;
}