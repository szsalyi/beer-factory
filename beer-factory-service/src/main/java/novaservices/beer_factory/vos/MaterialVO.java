package novaservices.beer_factory.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MaterialVO {
    private Long id;
    private String name;
    private int price;
}
