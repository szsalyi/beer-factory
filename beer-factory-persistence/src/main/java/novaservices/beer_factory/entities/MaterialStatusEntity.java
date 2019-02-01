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
@NoArgsConstructor
@Data
@Entity
@Table(name = "MATERIALSTATUS")
@NamedQuery(
        name = MaterialStatusEntity.FIND_BY_MATERIAL_ID,
        query = "SELECT ms " +
                "FROM MaterialStatusEntity ms " +
                "WHERE ms.material.id = :id")
@NamedQuery(
        name = MaterialStatusEntity.FIND_ALL,
        query = "SELECT ms " +
                "FROM MaterialStatusEntity ms"
)
@NamedQuery(
        name = MaterialStatusEntity.FIND_ALL_AVAILABLE,
        query = "SELECT new MaterialStatusEntity (ms.id, ms.available, ms.material) " +
                "FROM MaterialStatusEntity ms"
)
public class MaterialStatusEntity extends BaseEntity {
    public static final String FIND_BY_MATERIAL_ID = "MaterialStatus.findByMaterialId";
    public static final String FIND_ALL = "MaterialStatus.findAll";
    public static final String FIND_ALL_AVAILABLE = "MaterialStatus.findAllAvailable";
    private Long available;

    private Long reserved;

    @OneToOne
    private MaterialEntity material;

    public MaterialStatusEntity (Long id, Long available, MaterialEntity material) {
        this.id = id;
        this.available = available;
        this.material = material;
    }

}
