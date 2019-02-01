package novaservices.beer_factory.dao;

import novaservices.beer_factory.entities.RecipeEntity;

import java.util.List;

public interface RecipeDao {
    RecipeEntity create(RecipeEntity entity);

    RecipeEntity createRecipeBase(RecipeEntity entity);

    RecipeEntity read(Long id);

    RecipeEntity update(RecipeEntity entity);

    void delete(Long id);

    List<RecipeEntity> readAll();
}
