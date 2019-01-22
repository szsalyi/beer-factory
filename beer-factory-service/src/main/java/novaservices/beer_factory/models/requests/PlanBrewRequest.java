package novaservices.beer_factory.models.requests;

import lombok.Data;
import novaservices.beer_factory.vos.BrewVO;

/*
 * @author Szabolcs Sályi
 * {@link PlanBrewRequest}
 * PlanBrewRequest
 */
@Data
public class PlanBrewRequest {
    private BrewVO brew;
}
