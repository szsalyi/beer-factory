package novaservices.beer_factory.models.mappers;

import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.entities.RecipeMaterialEntity;
import novaservices.beer_factory.entities.RecipeMaterialPK;
import novaservices.beer_factory.vos.RecipeVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi")
public interface RecipeMapper {
    @Mapping(target = "recipeMaterialIds", source = "recipeMaterial")
    RecipeVO toVo(RecipeEntity entity);

    @InheritInverseConfiguration
    RecipeEntity toEntity(RecipeVO materialVO);

    default RecipeMaterialPK fromEntity(RecipeMaterialEntity entity) {
        RecipeMaterialPK pk = new RecipeMaterialPK();
        pk.setMaterialId(entity.getMaterialId());
        pk.setRecipeId(entity.getRecipeId());

        return pk;
    }
}