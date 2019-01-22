package novaservices.beer_factory.models.mappers;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import novaservices.beer_factory.entities.MaterialStatusEntity;
import novaservices.beer_factory.vos.MaterialStatusVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-22T16:03:48+0100",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@ApplicationScoped
public class MaterialStatusMapperImpl implements MaterialStatusMapper {

    @Override
    public MaterialStatusVO toVo(MaterialStatusEntity e) {
        if ( e == null ) {
            return null;
        }

        MaterialStatusVO materialStatusVO = new MaterialStatusVO();

        materialStatusVO.setId( e.id );

        return materialStatusVO;
    }

    @Override
    public MaterialStatusEntity toEntity(MaterialStatusVO vo) {
        if ( vo == null ) {
            return null;
        }

        MaterialStatusEntity materialStatusEntity = new MaterialStatusEntity();

        materialStatusEntity.id = vo.getId();

        return materialStatusEntity;
    }
}
