package novaservices.beer_factory.service;

import novaservices.beer_factory.vos.RecipeVO;

import java.util.List;

public interface RecipeService {
    RecipeVO create(RecipeVO recipeVO);

    RecipeVO get(Long id);

    RecipeVO update(RecipeVO recipeVO);

    void delete(Long id);

    List<RecipeVO> readAll();
}
