package com.bookings.exception;

public class BookingApplicationRuntimeException extends RuntimeException {

	private String msg;
	
	public BookingApplicationRuntimeException(String errorMsg) {
		super();
		msg = errorMsg;
	}

	@Override
	public String toString() {
		return "BookingApplicationException [msg=" + msg + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1530871102702399295L;

	
}
