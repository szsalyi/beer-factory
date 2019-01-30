package novaservices.beer_factory.models.requests;

import lombok.Data;
import novaservices.beer_factory.vos.MaterialVO;

/*
 * @author Szabolcs Sályi
 * {@link StoreMaterialRequest}
 * StoreMaterialRequest
 */
@Data
public class StoreMaterialRequest {
    private MaterialVO material;
    private Long quantity;
}
