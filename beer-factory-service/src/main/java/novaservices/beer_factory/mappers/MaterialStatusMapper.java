package novaservices.beer_factory.mappers;

import novaservices.beer_factory.entities.MaterialStatusEntity;
import novaservices.beer_factory.vos.MaterialStatusVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface MaterialStatusMapper extends GenericMapper<MaterialStatusEntity, MaterialStatusVO> {
}