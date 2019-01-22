package novaservices.beer_factory.models.responses;

import lombok.Data;
import novaservices.beer_factory.vos.MaterialStatusVO;

import java.util.List;

@Data
public class StoreStatusResponse {
    private List<MaterialStatusVO> materials;
}
