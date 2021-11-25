package com.bookings.sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookings.model.Genre;
import com.bookings.model.Movie;
import com.bookings.service.MovieService;

@Component
public class GenerateSampleData {

	@Autowired
	private MovieService movieService;

	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	public void insertSampleMovies() throws Exception {
		Date fd = formatter.parse("1970-01-01");
		movieService.dropAll();
		Movie movies[] = {
				new Movie( "sholay1", "Dharmendra", Genre.Action.toString(),
						formatter.parse("1970-01-01")),
				new Movie( "Jeet2", "Sunny Deol", Genre.Action.toString(),
						formatter.parse("1990-01-01")),
				new Movie( "sholay3", "Dharmendra", Genre.Action.toString(),
						formatter.parse("1970-01-01")),
				new Movie( "Jeet4", "Sunny Deol", Genre.Action.toString(),
						formatter.parse("1990-01-01")),
				new Movie( "sholay5", "Dharmendra", Genre.Action.toString(),
						formatter.parse("1970-01-01")),
				new Movie( "Jeet6", "Sunny Deol", Genre.Action.toString(),
						formatter.parse("1990-01-01")),
				new Movie( "sholay7", "Dharmendra", Genre.Action.toString(),
						formatter.parse("1970-01-01")),
				new Movie( "Jeet8", "Sunny Deol", Genre.Action.toString(),
						formatter.parse("1990-01-01")),
				new Movie( "sholay9", "Dharmendra", Genre.Action.toString(),
						formatter.parse("1970-01-01")),
				new Movie( "Jeet10", "Sunny Deol", Genre.Action.toString(),
						formatter.parse("1990-01-01"))					
		};

		for (Movie movie : movies) {
			movieService.newMovie(movie);
		}
	}
}
