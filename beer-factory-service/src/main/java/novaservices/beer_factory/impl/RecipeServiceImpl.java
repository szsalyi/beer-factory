package novaservices.beer_factory.impl;

import novaservices.beer_factory.dao.RecipeDao;
import novaservices.beer_factory.service.RecipeService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class RecipeServiceImpl implements RecipeService {

    @Inject
    RecipeDao recipeDao;
}
