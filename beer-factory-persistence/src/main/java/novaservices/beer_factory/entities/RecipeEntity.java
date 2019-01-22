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

    @OneToMany(mappedBy = "recipe")
    private Set<BrewEntity> brews;

    @ManyToMany(cascade = {
            CascadeType.MERGE,
            CascadeType.PERSIST
    })
    @JoinTable(name = "RECIPE_MATERIAL",
            joinColumns = @JoinColumn(name = "RECIPE_ID"),
            inverseJoinColumns = @JoinColumn(name = "MATERIAL_ID"))
    private Set<MaterialEntity> materials;
}
