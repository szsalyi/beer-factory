package novaservices.beer_factory.models.mappers;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.vos.RecipeVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-22T14:04:40+0100",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@ApplicationScoped
public class RecipeMapperImpl implements RecipeMapper {

    @Override
    public RecipeVO toVo(RecipeEntity e) {
        if ( e == null ) {
            return null;
        }

        RecipeVO recipeVO = new RecipeVO();

        recipeVO.setId( e.id );
        recipeVO.setName( e.getName() );

        return recipeVO;
    }

    @Override
    public RecipeEntity toEntity(RecipeVO vo) {
        if ( vo == null ) {
            return null;
        }

        RecipeEntity recipeEntity = new RecipeEntity();

        recipeEntity.setName( vo.getName() );
        recipeEntity.id = vo.getId();

        return recipeEntity;
    }
}
