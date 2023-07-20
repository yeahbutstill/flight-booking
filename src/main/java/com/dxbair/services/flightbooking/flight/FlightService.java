package com.dxbair.services.flightbooking.flight;

import com.dxbair.services.flightbooking.domain.entity.Flight;

import java.util.List;

public interface FlightService {
	
	Flight getFlightById(String flightId);

	List<Flight> getAllFlights();
}
