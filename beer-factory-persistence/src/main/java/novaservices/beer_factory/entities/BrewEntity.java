package novaservices.beer_factory.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import novaservices.beer_factory.enums.BrewStatus;

import javax.persistence.*;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BREW")
public class BrewEntity extends BaseEntity {
    private Date plannedDate;

    private Long producedBeers;

    private BrewStatus brewStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RECIPE_ID")
    private RecipeEntity recipe;
}
