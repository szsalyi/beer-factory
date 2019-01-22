package novaservices.beer_factory.models.responses;

import lombok.Data;
import novaservices.beer_factory.vos.BrewVO;

@Data
public class SetBrewStatusResponse {
    private BrewVO brew;
}
