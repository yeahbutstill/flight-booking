package com.dxbair.services.flightbooking.flight;

import com.dxbair.services.flightbooking.system.ResourceNotFoundException;

import java.io.Serial;

public class FlightNotFoundException extends ResourceNotFoundException {

	@Serial
	private static final long serialVersionUID = 6293499259584600291L;

	public FlightNotFoundException(String flightId) {
		super("Flight", "flight-id", flightId);
	}

}
