package com.exampleforspring.SpringCourse2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exampleforspring.SpringCourse2.domain.Book;

public interface BookRespository extends CrudRepository<Book, Long> {

}
