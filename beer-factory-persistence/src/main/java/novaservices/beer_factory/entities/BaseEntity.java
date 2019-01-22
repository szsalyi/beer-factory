package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@SequenceGenerator(name = BaseEntity.SEQUENCE_NAME, allocationSize = 1)
@MappedSuperclass
public class BaseEntity {
    static final String SEQUENCE_NAME = "SEQ_BEER";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "BEER")
    public Long id;
}
