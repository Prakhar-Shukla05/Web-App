package com.exampleforspring.SpringCourse2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.exampleforspring.SpringCourse2.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
