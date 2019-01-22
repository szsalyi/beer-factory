package novaservices.beer_factory.vos;

import lombok.Data;

import java.util.List;

@Data
public class RecipeVO {
    private Long id;
    private List<Long> materialRecipeId;
    private String name;
}
