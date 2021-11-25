package com.bookings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookings.model.Movie;
import com.bookings.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;

	public Movie[] all() {
		return repository.findAll().toArray(new Movie[0]);
	}
	
	public Movie newMovie(Movie newMovie) {
		return repository.save(newMovie);
	}

	public void deleteMovie(Long id) {
		repository.deleteById(id);
	}
	
	public void dropAll() {
		repository.deleteAll();
	}

}
