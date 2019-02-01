package novaservices.beer_factory.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import novaservices.beer_factory.entities.RecipeMaterialPK;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecipeMaterialVO {
    private RecipeMaterialPK recipeMaterialPK;
    private MaterialVO material;
    //private RecipeVO recipe;
    private int requiredQuantity;
}