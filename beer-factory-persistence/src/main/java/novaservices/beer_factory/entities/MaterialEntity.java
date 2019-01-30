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
@Table(name = "MATERIAL")
public class MaterialEntity extends BaseEntity {
    private String name;

    private int price;

    /*@OneToOne(mappedBy = "material")
    private MaterialStatusEntity materialStatus;*/

   /* @OneToMany(mappedBy = "material")
    private Set<RecipeMaterialEntity> recipeMaterial;*/
}
