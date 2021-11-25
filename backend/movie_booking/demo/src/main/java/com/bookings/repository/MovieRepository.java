package com.bookings.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookings.model.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie, Long>  {

	
}
