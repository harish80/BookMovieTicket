package com.bookings;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookings.exception.BookingApplicationRuntimeException;
import com.bookings.sample.GenerateSampleData;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private GenerateSampleData generateSampleData;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void genAllsample() {
		try {
			generateSampleData.insertSampleMovies();
		} catch (Exception e) {
			e.printStackTrace();
			throw new BookingApplicationRuntimeException(
					"Unable to genrate Sample Data. Check Mongo Connection and DB Details");
		}
	}
}
