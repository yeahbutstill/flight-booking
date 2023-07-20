package com.dxbair.services.flightbooking.booking;

import com.dxbair.services.flightbooking.system.ResourceNotFoundException;

import java.io.Serial;

public class BookingNotFoundException extends ResourceNotFoundException {
	
	@Serial
	private static final long serialVersionUID = -3880429246973279969L;

	public BookingNotFoundException(String bookingId) {
		super("Booking", "booking-id", bookingId);
	}

}
