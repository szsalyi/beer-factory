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
public class RecipeEntity extends BaseEntity {
    private String name;

   /* @OneToMany(mappedBy = "recipe")
    private Set<BrewEntity> brews;*/

    @OneToMany
    @JoinColumn(name = "RECIPE_ID")
    private Set<RecipeMaterialEntity> recipeMaterial;
}
