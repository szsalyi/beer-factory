package novaservices.beer_factory.mappers;

import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.vos.MaterialVO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface MaterialMapper extends GenericMapper<MaterialEntity, MaterialVO> {
}
