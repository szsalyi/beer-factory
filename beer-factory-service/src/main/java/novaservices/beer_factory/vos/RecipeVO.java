package novaservices.beer_factory.vos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecipeVO {
    private Long id;
    private Set<RecipeMaterialVO> recipeMaterials;
    private String recipeName;
}
