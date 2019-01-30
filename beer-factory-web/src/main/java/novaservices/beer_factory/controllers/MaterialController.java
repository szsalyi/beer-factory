package novaservices.beer_factory.controllers;

import novaservices.beer_factory.service.MaterialService;
import novaservices.beer_factory.vos.MaterialVO;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "materialController")
public class MaterialController {

    @Inject
    private MaterialService materialService;

    @WebMethod(operationName = "create")
    public MaterialVO create(MaterialVO materialVO) {
        return materialService.create(materialVO);

    }

    @WebMethod(operationName = "read")
    public MaterialVO read(Long id) {
        return materialService.get(id);
    }

}