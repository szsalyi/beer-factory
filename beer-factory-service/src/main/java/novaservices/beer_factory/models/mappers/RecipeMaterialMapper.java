package novaservices.beer_factory.models.mappers;

import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.entities.RecipeMaterialEntity;
import novaservices.beer_factory.vos.RecipeMaterialVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Set;

@Mapper(componentModel = "cdi")
public interface RecipeMaterialMapper {
//    @InheritInverseConfiguration
    RecipeMaterialEntity toEntity(RecipeMaterialVO materialVO);

//    @Mapping(target = "recipe", source = "recipe.id")
    RecipeMaterialVO toVo(RecipeMaterialEntity entity);

/*    default RecipeEntity fromLong(Long id) {
        RecipeEntity recipeEntity = new RecipeEntity();
        recipeEntity.setId(id);

        return recipeEntity;
    }*/

    Set<RecipeMaterialVO> toSetVo(Set<RecipeMaterialEntity> entities);
    Set<RecipeMaterialEntity> toSetEntity(Set<RecipeMaterialVO> entities);
}
