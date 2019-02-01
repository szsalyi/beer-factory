package novaservices.beer_factory.controllers;


import novaservices.beer_factory.models.requests.StoreMaterialRequest;
import novaservices.beer_factory.models.requests.StoreStatusRequest;
import novaservices.beer_factory.models.responses.StoreMaterialResponse;
import novaservices.beer_factory.models.responses.StoreStatusResponse;
import novaservices.beer_factory.service.MaterialService;
import novaservices.beer_factory.service.MaterialStatusService;
import novaservices.beer_factory.vos.MaterialStatusVO;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


@WebService(serviceName = "storeController")
public class StoreController {

    @Inject
    private MaterialStatusService statusService;


    @WebMethod(operationName = "store")
    public StoreMaterialResponse store(StoreMaterialRequest request) {
        StoreMaterialResponse response = new StoreMaterialResponse();
        MaterialStatusVO statusVO = new MaterialStatusVO();

        statusVO = statusService.create(request.getMaterial(), request.getQuantity());

        response.setStoredMaterialStatusId(statusVO.getId());
        response.setStoredMaterialId(statusVO.getMaterialId());
        response.setStoredMaterialName(statusVO.getName());
        response.setAvailableQuantity(statusVO.getAvailable());
        response.setReservedQuantity(statusVO.getReserved());

        return response;
    }

    @WebMethod(operationName = "getSoreStatus")
    public StoreStatusResponse getStatus(StoreStatusRequest request) {
        StoreStatusResponse response = new StoreStatusResponse();

        List<MaterialStatusVO> statusVOList = statusService.getStoreStatus(request.isOnlyAvailable());
        response.setMaterials(statusVOList);

        return response;
    }
}
