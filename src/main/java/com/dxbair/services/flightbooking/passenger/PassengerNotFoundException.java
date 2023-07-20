package com.dxbair.services.flightbooking.passenger;

import com.dxbair.services.flightbooking.system.ResourceNotFoundException;

import java.io.Serial;

public class PassengerNotFoundException extends ResourceNotFoundException {

	@Serial
	private static final long serialVersionUID = -7428665705397767944L;

	public PassengerNotFoundException(String passengerId) {
		super("Passenger", "passenger-id", passengerId);
	}

}
