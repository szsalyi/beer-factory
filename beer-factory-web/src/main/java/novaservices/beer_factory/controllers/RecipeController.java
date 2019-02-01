package novaservices.beer_factory.controllers;

import novaservices.beer_factory.models.requests.CreateRecipeRequest;
import novaservices.beer_factory.models.requests.DeleteRecipeRequest;
import novaservices.beer_factory.models.requests.GetRecipeRequest;
import novaservices.beer_factory.models.responses.CreateRecipeResponse;
import novaservices.beer_factory.models.responses.DeleteRecipeResponse;
import novaservices.beer_factory.models.responses.GetRecipeResponse;
import novaservices.beer_factory.service.RecipeService;
import novaservices.beer_factory.vos.RecipeVO;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "recipeController")
public class RecipeController {

    @Inject
    private RecipeService recipeService;

    @WebMethod(operationName = "createRecipeMethod")
    public CreateRecipeResponse createRecipeMethod(CreateRecipeRequest request) {
        CreateRecipeResponse response = new CreateRecipeResponse();

        RecipeVO recipeVO = recipeService.create(request.getRecipe());

        response.setRecipe(recipeVO);
        return response;
    }

    @WebMethod(operationName = "deleteRecipeMethod")
    public DeleteRecipeResponse deleteRecipeMethod(DeleteRecipeRequest request) {
        DeleteRecipeResponse response = new DeleteRecipeResponse();

        try {
            recipeService.delete(request.getId());
            response.setSuccess(true);
        } catch (Exception e) {
            response.setSuccess(false);
        } //TODO(SSALYI) Handle non success delete process

        return response;
    }

    @WebMethod(operationName = "getRecipeMethod")
    public GetRecipeResponse getRecipeMethod(GetRecipeRequest request) {
        GetRecipeResponse response = new GetRecipeResponse();

        RecipeVO recipeVO = recipeService.get(request.getId());
        response.setRecipe(recipeVO);
        return response;
    }

    @WebMethod(operationName = "updateRecipeMethod")
    public RecipeVO updateRecipeMethod(RecipeVO recipeVO) {
        RecipeVO createdRecipeVO = recipeService.create(recipeVO);

        return createdRecipeVO;
    }

    @WebMethod(operationName = "readAllRecipeMethod")
    public List<RecipeVO> getAllRecipeMethod() {
        List<RecipeVO> createdRecipeVOs = recipeService.readAll();

        return createdRecipeVOs;
    }
}
