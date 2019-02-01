package novaservices.beer_factory.models.responses;

import lombok.Data;
import novaservices.beer_factory.enums.BrewStatus;
import novaservices.beer_factory.vos.RecipeVO;

import java.util.Date;

@Data
public class PlanBrewResponse {
    private Long brewId;
    private Long recipeId;
    private Date plannedDate;
    private int producedBeers;
    private BrewStatus status;
}
