package tr.ogr.trakya.mericisyar.sampleSpringWebApp.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
