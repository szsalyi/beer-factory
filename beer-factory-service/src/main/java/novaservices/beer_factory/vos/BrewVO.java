package novaservices.beer_factory.vos;

import lombok.Data;
import novaservices.beer_factory.enums.BrewStatus;

import java.util.Date;

@Data
public class BrewVO {
    private Long id;
    private Long recipeId;
    private Date plannedDate;
    //private int producedBeers;
    //private BrewStatus isSuccess;
}
