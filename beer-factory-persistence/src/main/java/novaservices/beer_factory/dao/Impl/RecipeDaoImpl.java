package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.RecipeDao;
import novaservices.beer_factory.entities.RecipeEntity;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class RecipeDaoImpl /*extends GenericDaoImpl<RecipeEntity> */implements RecipeDao {


    @Override
    public RecipeEntity create(RecipeEntity t) {
        return null;
    }

    @Override
    public RecipeEntity read(RecipeEntity t) {
        return null;
    }

    @Override
    public List<RecipeEntity> readAll(RecipeEntity t) {
        return null;
    }

    @Override
    public RecipeEntity update(RecipeEntity t) {
        return null;
    }

    @Override
    public void delete(RecipeEntity t) {

    }
}
