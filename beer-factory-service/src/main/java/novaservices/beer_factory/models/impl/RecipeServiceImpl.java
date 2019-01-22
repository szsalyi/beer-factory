package novaservices.beer_factory.models.impl;

import novaservices.beer_factory.dao.RecipeDao;
import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.models.mappers.RecipeMapper;
import novaservices.beer_factory.vos.RecipeVO;

import javax.ejb.Stateless;

@Stateless
public class RecipeServiceImpl extends GenericServiceImpl<RecipeEntity, RecipeVO, RecipeDao, RecipeMapper> {
}
