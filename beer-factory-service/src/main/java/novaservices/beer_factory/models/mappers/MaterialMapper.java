package novaservices.beer_factory.models.mappers;

import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.vos.MaterialVO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "cdi")
public interface MaterialMapper {
    MaterialEntity toEntity(MaterialVO materialVO);

    MaterialVO toVo(MaterialEntity entity);

    List<MaterialVO> toVoList(List<MaterialEntity> materialStatusEntities);

    List<MaterialEntity> toEntityList(List<MaterialVO> materialStatusVos);
}
