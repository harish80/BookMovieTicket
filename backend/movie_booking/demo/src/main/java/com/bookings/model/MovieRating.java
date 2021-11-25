package com.bookings.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movierating")
public class MovieRating {


	@Id
	private Long id;
	
	private Long movieID;
	private Long stars;
	private Long num_ratings;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the movieID
	 */
	public Long getMovieID() {
		return movieID;
	}
	/**
	 * @param movieID the movieID to set
	 */
	public void setMovieID(Long movieID) {
		this.movieID = movieID;
	}
	/**
	 * @return the stars
	 */
	public Long getStars() {
		return stars;
	}
	/**
	 * @param stars the stars to set
	 */
	public void setStars(Long stars) {
		this.stars = stars;
	}
	/**
	 * @return the num_ratings
	 */
	public Long getNum_ratings() {
		return num_ratings;
	}
	/**
	 * @param num_ratings the num_ratings to set
	 */
	public void setNum_ratings(Long num_ratings) {
		this.num_ratings = num_ratings;
	}
	
}
