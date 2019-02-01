package novaservices.beer_factory.impl;

import novaservices.beer_factory.dao.RecipeDao;
import novaservices.beer_factory.entities.RecipeEntity;
import novaservices.beer_factory.entities.RecipeMaterialPK;
import novaservices.beer_factory.models.mappers.RecipeMapper;
import novaservices.beer_factory.service.RecipeMaterialService;
import novaservices.beer_factory.service.RecipeService;
import novaservices.beer_factory.vos.RecipeVO;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class RecipeServiceImpl implements RecipeService {

    @Inject
    private RecipeDao recipeDao;

    @Inject
    private RecipeMaterialService recipeMaterialService;

    @Inject
    private RecipeMapper recipeMapper;

    @Override
    public RecipeVO create(RecipeVO recipeVO) {
        RecipeEntity recipeEntity = recipeMapper.toEntity(recipeVO);

        RecipeEntity savedEntity = recipeDao.createRecipeBase(recipeEntity);

        recipeEntity.setId(savedEntity.getId());
        recipeEntity.getRecipeMaterial().forEach(rm ->
                rm.setRecipeMaterialPK(new RecipeMaterialPK(savedEntity.getId())));

        //recipeEntity.getRecipeMaterial().forEach(rm -> rm.setRecipe(savedEntity));

        RecipeVO recipeVO1 = recipeMapper.toVo(recipeEntity);

        recipeVO1.getRecipeMaterials().forEach(rm -> rm = recipeMaterialService.create(rm));

        /*recipeVO1.getRecipeMaterials().forEach(rm ->
                rm.getRecipeMaterialPK().setMaterialId(rm.getMaterial().getId()));*/

        recipeEntity = recipeDao.update(recipeMapper.toEntity(recipeVO1));

        return recipeMapper.toVo(recipeEntity);
    }

    @Override
    public RecipeVO get(Long id) {
        RecipeEntity recipeEntity = recipeDao.read(id);
        return recipeMapper.toVo(recipeEntity);
    }

    @Override
    public RecipeVO update(RecipeVO recipeVO) {
        RecipeEntity entity = recipeMapper.toEntity(recipeVO);
        RecipeEntity recipeEntity = recipeDao.update(entity);
        return recipeMapper.toVo(recipeEntity);
    }

    @Override
    public void delete(Long id) {
        recipeDao.delete(id);
    }

    @Override
    public List<RecipeVO> readAll() {
        List<RecipeEntity> recipeEntities = recipeDao.readAll();
        return recipeMapper.toVoList(recipeEntities);
    }
}
