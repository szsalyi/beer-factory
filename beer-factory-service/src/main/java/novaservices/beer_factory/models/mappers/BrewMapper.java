package novaservices.beer_factory.models.mappers;

import novaservices.beer_factory.entities.BrewEntity;
import novaservices.beer_factory.vos.BrewVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface BrewMapper extends GenericMapper<BrewEntity, BrewVO> {
}
