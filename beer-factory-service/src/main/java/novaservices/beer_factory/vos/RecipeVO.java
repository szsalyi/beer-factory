package novaservices.beer_factory.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import novaservices.beer_factory.entities.RecipeMaterialPK;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecipeVO {
    private Long id;
    private List<RecipeMaterialPK> recipeMaterialIds;
    private String name;
}
