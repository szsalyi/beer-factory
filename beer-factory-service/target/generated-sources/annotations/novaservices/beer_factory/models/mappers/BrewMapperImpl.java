package novaservices.beer_factory.models.mappers;

import javax.annotation.Generated;
import javax.enterprise.context.ApplicationScoped;
import novaservices.beer_factory.entities.BrewEntity;
import novaservices.beer_factory.vos.BrewVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-01-22T16:03:48+0100",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_191 (Oracle Corporation)"
)
@ApplicationScoped
public class BrewMapperImpl implements BrewMapper {

    @Override
    public BrewVO toVo(BrewEntity e) {
        if ( e == null ) {
            return null;
        }

        BrewVO brewVO = new BrewVO();

        brewVO.setId( e.id );
        brewVO.setPlannedDate( e.getPlannedDate() );
        if ( e.getProducedBeers() != null ) {
            brewVO.setProducedBeers( e.getProducedBeers().intValue() );
        }

        return brewVO;
    }

    @Override
    public BrewEntity toEntity(BrewVO vo) {
        if ( vo == null ) {
            return null;
        }

        BrewEntity brewEntity = new BrewEntity();

        brewEntity.setPlannedDate( vo.getPlannedDate() );
        brewEntity.setProducedBeers( (long) vo.getProducedBeers() );
        brewEntity.id = vo.getId();

        return brewEntity;
    }
}
