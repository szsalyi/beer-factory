package novaservices.beer_factory.models.mappers;

import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.entities.RecipeMaterialEntity;
import novaservices.beer_factory.entities.RecipeMaterialPK;
import novaservices.beer_factory.vos.RecipeVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface RecipeMapper {
    @Mapping(target = "recipeMaterials", source = "recipeMaterial")
    RecipeVO toVo(RecipeEntity entity);

    @InheritInverseConfiguration
    RecipeEntity toEntity(RecipeVO materialVO);

    List<RecipeVO> toVoList(List<RecipeEntity> recipeEntities);

    List<RecipeEntity> toEntityList(List<RecipeVO> recipeVOS);

   /* default RecipeMaterialPK fromEntity(RecipeMaterialEntity entity) {
        RecipeMaterialPK pk = new RecipeMaterialPK();
        pk.setMaterialId(entity.getMaterialId());
        pk.setRecipe(entity.getRecipe());

        return pk;
    }*/
}