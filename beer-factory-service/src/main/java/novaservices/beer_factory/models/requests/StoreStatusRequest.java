package novaservices.beer_factory.models.requests;

import lombok.Data;

/*
 * @author Szabolcs Sályi
 * {@link StoreStatusRequest}
 * StoreStatusRequest
 */
@Data
public class StoreStatusRequest {
    private boolean onlyAvailable;
}
