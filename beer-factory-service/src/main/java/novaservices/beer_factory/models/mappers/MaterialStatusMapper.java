package novaservices.beer_factory.models.mappers;

import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.entities.MaterialStatusEntity;
import novaservices.beer_factory.vos.MaterialStatusVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface MaterialStatusMapper {
    @Mappings({
            @Mapping(target = "name", source = "entity.material.name"),
            @Mapping(target = "materialId", source = "entity.material.id")
    })
    MaterialStatusVO toVo(MaterialStatusEntity entity);

    @InheritInverseConfiguration
    MaterialStatusEntity toEntity(MaterialStatusVO materialVO);

    List<MaterialStatusVO> toVoList(List<MaterialStatusEntity> materialStatusEntities);

    List<MaterialStatusEntity> toEntityList(List<MaterialStatusVO> materialStatusVos);

    default Long fromEntity(MaterialEntity entity) {
        return entity.getId();
    }

    default MaterialEntity fromVO(Long aLong) {
        MaterialEntity entity = new MaterialEntity();
        entity.setId(aLong);
        return entity;
    }
}
