package tr.ogr.trakya.mericisyar.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
