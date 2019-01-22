package novaservices.beer_factory.models.responses;

import lombok.Data;
import novaservices.beer_factory.vos.RecipeVO;

@Data
public class CreateRecipeResponse {
    private RecipeVO recipe;
}
