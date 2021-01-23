package com.hkarabakla.repositories;

import com.hkarabakla.entities.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface AuthorRepo extends CrudRepository<Author,Integer> {
    Set<Author> findByName(String name);
}
