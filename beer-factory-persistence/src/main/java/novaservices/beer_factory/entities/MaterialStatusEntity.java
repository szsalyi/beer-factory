package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "MATERIALSTATUS")
@NamedQuery(
        name = MaterialStatusEntity.FIND_BY_MATERIAL_ID,
        query = "SELECT ms " +
                "FROM MaterialStatusEntity ms " +
                "WHERE ms.material.id = :id")
public class MaterialStatusEntity extends BaseEntity {
    public static final String FIND_BY_MATERIAL_ID = "MaterialStatus.findByMaterialId";
    private Long available;

    private Long reserved;

    @OneToOne
    private MaterialEntity material;

}
