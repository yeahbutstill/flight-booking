package com.dxbair.services.flightbooking.airport;

import com.dxbair.services.flightbooking.system.ResourceNotFoundException;

import java.io.Serial;

public class AirportNotFoundException extends ResourceNotFoundException {

	@Serial
	private static final long serialVersionUID = -4185306016942664972L;

	public AirportNotFoundException(String airportId) {
		super("Airport", "airport-id", airportId);
	}

}
