package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import novaservices.beer_factory.entities.enums.BrewStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BREW")
public class BrewEntity extends BaseEntity {
    private LocalDateTime plannedDate;

    private Long producedBeers;

    @Enumerated(value = EnumType.STRING)
    private BrewStatus brewStatus;

    @ManyToOne(fetch = FetchType.LAZY) //TODO(SSALYI) Neccessary???
    @JoinColumn(name = "RECIPE_ID")
    private RecipeEntity recipe;
}
