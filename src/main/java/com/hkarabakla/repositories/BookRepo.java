package com.hkarabakla.repositories;

import com.hkarabakla.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface BookRepo extends CrudRepository<Book,String> {
     Book findByName(String name);
     Set<Book> findAllByAuthors_NameContainingIgnoreCase(String name);
}
