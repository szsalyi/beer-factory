package novaservices.beer_factory.impl;

import novaservices.beer_factory.dao.MaterialStatusDao;
import novaservices.beer_factory.entities.MaterialStatusEntity;
import novaservices.beer_factory.models.mappers.MaterialStatusMapper;
import novaservices.beer_factory.service.MaterialService;
import novaservices.beer_factory.service.MaterialStatusService;
import novaservices.beer_factory.vos.MaterialStatusVO;
import novaservices.beer_factory.vos.MaterialVO;

import javax.inject.Inject;
import java.util.List;

public class MaterialStatusServiceImpl implements MaterialStatusService {

    @Inject
    private MaterialStatusDao materialStatusDao;

    @Inject
    private MaterialService materialService;

    @Inject
    private MaterialStatusMapper mapper;

    @Override
    public MaterialStatusVO getMaterialStatus(Long id) {
        MaterialStatusVO materialStatusVO = mapper.toVo(materialStatusDao.read(id));
        return materialStatusVO;
    }

    @Override
    public MaterialStatusVO create(MaterialVO requestMaterial, Long quantity) {
        MaterialStatusVO materialStatusVO = new MaterialStatusVO();
        MaterialStatusEntity materialStatusEntity = new MaterialStatusEntity();
        MaterialStatusEntity returnStatusEntity = new MaterialStatusEntity();
        MaterialVO materialVO = materialService.get(requestMaterial.getId());

        if (materialVO == null) {
            materialVO = materialService.update(requestMaterial);
            materialStatusVO.setMaterialId(materialVO.getId());
            materialStatusVO.setAvailable(quantity);
            materialStatusVO.setReserved(0L);
            returnStatusEntity = materialStatusDao.create(mapper.toEntity(materialStatusVO));
        } else {
            materialStatusEntity = materialStatusDao.readByMaterialId(materialVO.getId());
            materialStatusEntity.setAvailable( materialStatusEntity.getAvailable() + quantity);
            /*materialStatusVO.setMaterialId(materialVO.getId());
            materialStatusVO.setName(materialStatusEntity.getMaterial().getName());
            materialStatusVO.setReserved(materialStatusEntity.getReserved());
            materialStatusVO.setAvailable( materialStatusEntity.getAvailable() + quantity);*/
            returnStatusEntity = materialStatusDao.update(materialStatusEntity);
        }


        return mapper.toVo(returnStatusEntity);
    }

    @Override
    public void delete(MaterialStatusVO statusVO) {

    }

    @Override
    public List<MaterialStatusVO> getStoreStatus() {
        return null;
    }
}
