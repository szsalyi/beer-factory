package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "RECIPE_MATERIAL")
public class RecipeMaterialEntity {

    @EmbeddedId
    private RecipeMaterialPK recipeMaterialPK;

    @Column(name = "REQUIRED_QUANTITY", nullable = false)
    private Long requiredQuantity;

    //@MapsId(value = "RECIPE_ID")
/*
    @ManyToOne
    @JoinColumn(name = "RECIPE_ID", insertable = false, updatable = false)
    private RecipeEntity recipe;
*/


    //@MapsId(value = "MATERIAL_ID")
    @ManyToOne
    @JoinColumn(name = "MATERIAL_ID", insertable = false, updatable = false)
    private MaterialEntity material;

    public Long getMaterialId() {
        return this.recipeMaterialPK.getMaterialId();
    }

    public Long getRecipeId() {
        return this.recipeMaterialPK.getRecipeId();
    }
}