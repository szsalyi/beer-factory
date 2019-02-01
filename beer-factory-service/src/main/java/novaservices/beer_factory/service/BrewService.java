package novaservices.beer_factory.service;

import novaservices.beer_factory.enums.BrewStatus;
import novaservices.beer_factory.vos.BrewVO;

public interface BrewService {
    BrewVO planBrew(BrewVO brewVO);

    void setStatus(BrewStatus status);
}
