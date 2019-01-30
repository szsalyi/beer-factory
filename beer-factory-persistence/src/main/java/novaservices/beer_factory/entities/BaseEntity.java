package novaservices.beer_factory.entities;

import javax.persistence.*;

@SequenceGenerator(name = BaseEntity.SEQUENCE_NAME, allocationSize = 1)
@MappedSuperclass
public class BaseEntity {
    static final String SEQUENCE_NAME = "SEQ_BEER";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = SEQUENCE_NAME)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
