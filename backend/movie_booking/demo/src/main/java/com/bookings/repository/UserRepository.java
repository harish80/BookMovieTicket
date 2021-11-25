package com.bookings.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookings.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>  {

	
}
