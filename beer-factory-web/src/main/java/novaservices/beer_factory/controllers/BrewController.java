package novaservices.beer_factory.controllers;

import novaservices.beer_factory.models.requests.PlanBrewRequest;
import novaservices.beer_factory.models.requests.SetBrewStatusRequest;
import novaservices.beer_factory.models.responses.PlanBrewResponse;
import novaservices.beer_factory.models.responses.SetBrewStatusResponse;
import novaservices.beer_factory.service.BrewService;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "brewController")
public class BrewController {

    @Inject
    private BrewService brewService;

    @WebMethod(operationName = "plan")
    public PlanBrewResponse plan(PlanBrewRequest request) {
        PlanBrewResponse response = new PlanBrewResponse();

        return response;
    }

    @WebMethod(operationName = "setStatus")
    public SetBrewStatusResponse setStatus(SetBrewStatusRequest request) {
        SetBrewStatusResponse response = new SetBrewStatusResponse();

        return  response;
    }
}
