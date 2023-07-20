package com.dxbair.services.flightbooking.booking;

import com.dxbair.services.flightbooking.system.ResourceNotFoundException;

import java.io.Serial;

public class BookingNotFoundForPassengerException extends ResourceNotFoundException {
	
	@Serial
	private static final long serialVersionUID = -3880429246973279969L;

	public BookingNotFoundForPassengerException(String passengerId) {
		super("Booking for Passenger", "passenger-id", passengerId);
	}

}
