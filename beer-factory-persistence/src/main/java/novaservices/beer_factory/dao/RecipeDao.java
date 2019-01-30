package novaservices.beer_factory.dao;

import novaservices.beer_factory.entities.RecipeEntity;

import java.util.List;

public interface RecipeDao {
    RecipeEntity create(RecipeEntity entity);

    RecipeEntity read(Long id);

    List<RecipeEntity> readAll(RecipeEntity entity);

    RecipeEntity update(RecipeEntity entity);

    void delete(RecipeEntity entity);
}
