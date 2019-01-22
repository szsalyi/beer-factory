package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "MATERIALSTATUS")
public class MaterialStatusEntity extends BaseEntity {
    private Long available;

    private Long reserved;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MATERIAL_ID")
    private MaterialEntity material;
}
