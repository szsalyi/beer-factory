package novaservices.beer_factory.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MaterialStatusVO {
    private Long id;
    private Long materialId;
    private String name;
    private Long available;
    private Long reserved;
}
