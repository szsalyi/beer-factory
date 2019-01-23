package novaservices.beer_factory.mappers;

import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.vos.RecipeVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface RecipeMapper /*extends GenericMapper<RecipeEntity, RecipeVO> */ {
}
