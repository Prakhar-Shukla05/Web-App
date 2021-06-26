package com.exampleforspring.SpringCourse2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exampleforspring.SpringCourse2.domain.Author;

public interface AuthorRespository extends CrudRepository<Author, Long> {

}
