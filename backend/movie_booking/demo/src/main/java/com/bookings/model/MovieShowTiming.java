package com.bookings.model;

import java.util.Date;

public class MovieShowTiming {

	/**
	 * @return the movieScreenID
	 */
	public Long getMovieScreenID() {
		return movieScreenID;
	}
	/**
	 * @param movieScreenID the movieScreenID to set
	 */
	public void setMovieScreenID(Long movieScreenID) {
		this.movieScreenID = movieScreenID;
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
	 * @return the timeSlot
	 */
	public Date getTimeSlot() {
		return timeSlot;
	}
	/**
	 * @param timeSlot the timeSlot to set
	 */
	public void setTimeSlot(Date timeSlot) {
		this.timeSlot = timeSlot;
	}
	/**
	 * @return the availableSeats
	 */
	public Long getAvailableSeats() {
		return availableSeats;
	}
	/**
	 * @param availableSeats the availableSeats to set
	 */
	public void setAvailableSeats(Long availableSeats) {
		this.availableSeats = availableSeats;
	}
	/**
	 * @return the bookedSeats
	 */
	public Long getBookedSeats() {
		return bookedSeats;
	}
	/**
	 * @param bookedSeats the bookedSeats to set
	 */
	public void setBookedSeats(Long bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	private Long movieScreenID;
	private Long movieID;
	private Date timeSlot;
	private Long availableSeats;
	private Long bookedSeats;
}
