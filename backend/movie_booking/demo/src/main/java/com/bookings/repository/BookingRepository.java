package com.bookings.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookings.model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Long> {


}
