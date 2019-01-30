package novaservices.beer_factory.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RecipeMaterialPK implements Serializable {
    //@Column(name = "RECIPE_ID")
    private Long recipeId;

    //@Column(name = "MATERIAL_ID")
    private Long materialId;

    public RecipeMaterialPK(Long recipeId, Long materialId) {
        this.recipeId = recipeId;
        this.materialId = materialId;
    }

    public RecipeMaterialPK() {
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof RecipeMaterialPK) {
            RecipeMaterialPK pk = (RecipeMaterialPK) o;
            return Objects.equals(recipeId, pk.recipeId) && Objects.equals(materialId, pk.materialId);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeId, materialId);
    }
}
