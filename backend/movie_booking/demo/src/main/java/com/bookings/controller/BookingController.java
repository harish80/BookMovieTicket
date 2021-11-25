package com.bookings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookings.model.Booking;
import com.bookings.service.BookingService;

@RestController
@RequestMapping(value = "/api/v1/Booking")
public class BookingController {

	@Autowired
    private BookingService bookingService;

	
	@GetMapping("/all")
	List<Booking> all() {
		return bookingService.findAll();
	}
	@PostMapping("/save")
	Booking newBooking(@RequestBody Booking newBooking) {
		return bookingService.newBooking(newBooking);
	}

	
	@DeleteMapping("/delete/{id}")
	void deleteBooking(@PathVariable Long id) {
		bookingService.deleteBooking(id);
	}
}
