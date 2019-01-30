package novaservices.beer_factory.models.requests;

import lombok.Data;
import novaservices.beer_factory.vos.RecipeVO;

/*
 * @author Szabolcs Sályi
 * {@link CreateRecipeRequest}
 * CreateRecipeRequest
 */
//
@Data
public class CreateRecipeRequest {
    private RecipeVO recipe;
}
