package com.exampleforspring.SpringCourse2.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.exampleforspring.SpringCourse2.domain.Author;
import com.exampleforspring.SpringCourse2.domain.Book;
import com.exampleforspring.SpringCourse2.domain.Publisher;
import com.exampleforspring.SpringCourse2.repositories.AuthorRespository;
import com.exampleforspring.SpringCourse2.repositories.BookRespository;
import com.exampleforspring.SpringCourse2.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRespository authorRepository;
	private final BookRespository bookRepository;
    private final PublisherRepository publisherRepository;
	
    

	public BootStrapData(AuthorRespository authorRepository, BookRespository bookRepository,
			PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Publisher publisher = new Publisher();
		publisher.setName("Prakhar Publishing");
		publisher.setCity("Etawah");
		publisher.setState("UP");
		
		publisherRepository.save(publisher);
		System.out.println("Publisher count "+ publisherRepository.count());
		
		Author prakhar = new Author("Prakhar", "Shukla");
		Book majestic = new Book("Domain Driver Design", "122212");
		majestic.setAuthor(prakhar);
		authorRepository.save(prakhar);
		bookRepository.save(majestic);

		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development", "123213");

		noEJB.setAuthor(rod);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		
		System.out.println("Started in bootstrap");
		System.out.println("Number of books: " + bookRepository.count());


	}

}
