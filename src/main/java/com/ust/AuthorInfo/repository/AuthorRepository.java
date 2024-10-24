package com.ust.AuthorInfo.repository;

import com.ust.AuthorInfo.model.Author;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, Integer> {

}
