package novaservices.beer_factory.dao.Impl;

import novaservices.beer_factory.dao.RecipeDao;
import novaservices.beer_factory.entities.RecipeEntity;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class RecipeDaoImpl implements RecipeDao {

    @Override
    public RecipeEntity create(RecipeEntity entity) {
        return null;
    }

    @Override
    public RecipeEntity read(Long id) {
        return null;
    }

    @Override
    public List<RecipeEntity> readAll(RecipeEntity entity) {
        return null;
    }

    @Override
    public RecipeEntity update(RecipeEntity entity) {
        return null;
    }

    @Override
    public void delete(RecipeEntity entity) {

    }
}
