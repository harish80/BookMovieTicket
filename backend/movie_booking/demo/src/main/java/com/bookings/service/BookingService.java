package com.bookings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookings.model.Booking;
import com.bookings.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private  BookingRepository repository;

	
	public List<Booking> findAll() {
		return repository.findAll();
	}

	public Booking newBooking(Booking newBooking) {
		return repository.save(newBooking);
	}
	
	public void deleteBooking(Long id) {
		repository.deleteById(id);
	}
}
