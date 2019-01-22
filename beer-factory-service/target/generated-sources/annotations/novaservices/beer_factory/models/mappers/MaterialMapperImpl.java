package novaservices.beer_factory.models.mappers;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import novaservices.beer_factory.entities.MaterialEntity;
import novaservices.beer_factory.vos.MaterialVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-22T14:04:40+0100",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@ApplicationScoped
public class MaterialMapperImpl implements MaterialMapper {

    @Override
    public MaterialVO toVo(MaterialEntity e) {
        if ( e == null ) {
            return null;
        }

        MaterialVO materialVO = new MaterialVO();

        materialVO.setId( e.id );
        materialVO.setName( e.getName() );
        materialVO.setPrice( e.getPrice() );

        return materialVO;
    }

    @Override
    public MaterialEntity toEntity(MaterialVO vo) {
        if ( vo == null ) {
            return null;
        }

        MaterialEntity materialEntity = new MaterialEntity();

        materialEntity.setName( vo.getName() );
        materialEntity.setPrice( vo.getPrice() );
        materialEntity.id = vo.getId();

        return materialEntity;
    }
}
