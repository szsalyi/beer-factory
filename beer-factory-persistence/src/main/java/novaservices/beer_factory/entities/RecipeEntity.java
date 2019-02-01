package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "RECIPE")
@NamedQuery(
        name = RecipeEntity.FIND_ALL,
        query = "SELECT r " +
                "FROM RecipeEntity r"
)
public class RecipeEntity extends BaseEntity {
    public static final String FIND_ALL = "RecipeEntity.findAll";

    @Column(name = "RECIPE_NAME")
    private String recipeName;

   /* @OneToMany(mappedBy = "recipe")
    private Set<BrewEntity> brews;*/
   @OneToMany
   @JoinColumns({
           @JoinColumn(name = "RECIPE_ID")
   })
   private Set<RecipeMaterialEntity> recipeMaterial;

}
