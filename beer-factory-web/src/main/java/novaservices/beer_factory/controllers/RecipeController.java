package novaservices.beer_factory.controllers;

import novaservices.beer_factory.models.requests.CreateRecipeRequest;
import novaservices.beer_factory.models.requests.DeleteRecipeRequest;
import novaservices.beer_factory.models.requests.GetRecipeRequest;
import novaservices.beer_factory.models.responses.CreateRecipeResponse;
import novaservices.beer_factory.models.responses.DeleteRecipeResponse;
import novaservices.beer_factory.models.responses.GetRecipeResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "recipeController")
public class RecipeController {

    @WebMethod(operationName = "createRecipe")
    public CreateRecipeResponse createRecipe(CreateRecipeRequest request) {
        CreateRecipeResponse response = new CreateRecipeResponse();

        return response;
    }

    @WebMethod(operationName = "deleteRecipe")
    public DeleteRecipeResponse deleteRecipe(DeleteRecipeRequest request) {
        DeleteRecipeResponse response = new DeleteRecipeResponse();

        return response;
    }

    @WebMethod(operationName = "getRecipe")
    public GetRecipeResponse getRecipe(GetRecipeRequest request) {
        GetRecipeResponse response = new GetRecipeResponse();

        return response;
    }
}
