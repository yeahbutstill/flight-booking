package com.dxbair.services.flightbooking.passenger;

import com.dxbair.services.flightbooking.domain.entity.Passenger;

import java.util.List;

public interface PassengerService {
	
	Passenger getPassengerById(String passengerId);

	List<Passenger> getAllPassengers();
}
