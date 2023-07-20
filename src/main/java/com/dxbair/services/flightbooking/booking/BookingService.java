package com.dxbair.services.flightbooking.booking;

import com.dxbair.services.flightbooking.domain.entity.FlightBooking;

import java.util.List;

public interface BookingService {
	
	FlightBooking getBooking(String bookingId);
	
	List<FlightBooking> getAllBookingsByPassenger(String passengerId);

	List<FlightBooking> getAllMultiFlightBookingsByPassenger(String passengerId);

	List<FlightBooking> getAllMultiFlightBookings();
	
	void createSampleBookings();

}
