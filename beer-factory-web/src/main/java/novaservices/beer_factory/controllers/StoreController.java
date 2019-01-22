package novaservices.beer_factory.controllers;


import novaservices.beer_factory.models.requests.StoreMaterialRequest;
import novaservices.beer_factory.models.requests.StoreStatusRequest;
import novaservices.beer_factory.models.responses.StoreMaterialResponse;
import novaservices.beer_factory.models.responses.StoreStatusResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(serviceName = "storeController")
public class StoreController {

    @WebMethod(operationName = "storeMaterial")
    public StoreMaterialResponse storeMaterial(StoreMaterialRequest request) {
        StoreMaterialResponse response = new StoreMaterialResponse();


        return response;
    }

    @WebMethod(operationName = "getSoreStatus")
    public StoreStatusResponse getStoreStatus(StoreStatusRequest request) {
        boolean onlyAvailable = request.isOnlyAvailable();

        StoreStatusResponse response = new StoreStatusResponse();
        return response;
    }
}
