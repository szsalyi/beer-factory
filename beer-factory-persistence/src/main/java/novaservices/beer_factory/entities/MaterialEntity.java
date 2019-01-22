package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "MATERIAL")
public class MaterialEntity extends BaseEntity {
    private String name;

    private int price;

    @OneToMany(mappedBy = "material")
    private Set<MaterialStatusEntity> materialStatuses;

    @ManyToMany(mappedBy = "materials")
    private Set<RecipeEntity> recipes;
}
