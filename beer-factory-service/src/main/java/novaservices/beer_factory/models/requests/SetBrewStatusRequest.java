package novaservices.beer_factory.models.requests;

import lombok.Data;

/*
 * @author Szabolcs Sályi
 * {@link SetBrewStatusRequest}
 * SetBrewStatusRequest
 */
@Data
public class SetBrewStatusRequest {
    private Long brewId;
    private boolean isSuccess;
}
