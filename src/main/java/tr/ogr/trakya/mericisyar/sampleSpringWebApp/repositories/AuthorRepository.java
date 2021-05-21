package tr.ogr.trakya.mericisyar.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
