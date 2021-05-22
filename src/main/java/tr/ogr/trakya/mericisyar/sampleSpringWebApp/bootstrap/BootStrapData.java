package tr.ogr.trakya.mericisyar.sampleSpringWebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.domain.Author;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.domain.Book;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.repositories.AuthorRepository;
import tr.ogr.trakya.mericisyar.sampleSpringWebApp.repositories.BookRepository;

public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Author eric=new Author("Eric","Evas");
        Book ddd=new Book("Domain Driven Design","123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books :"+ bookRepository.count());

    }
}
