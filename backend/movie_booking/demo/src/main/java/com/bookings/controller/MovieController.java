package com.bookings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookings.model.Movie;
import com.bookings.service.MovieService;

@RestController
@RequestMapping(value = "/api/v1")
public class MovieController {
	@Autowired
	private MovieService service;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/Movies")
	public Movie[] all() {
		return service.all();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/Movies")
	public Movie newMovie(@RequestBody Movie newMovie) {
		return service.newMovie(newMovie);
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/Movies/{id}")
	public void deleteMovie(@PathVariable Long id) {
		service.deleteMovie(id);
	}
}