package com.dxbair.services.flightbooking.airport;

import com.dxbair.services.flightbooking.domain.entity.Airport;

import java.util.List;

public interface AirportService {
	Airport getAirportById(String airportId);
	List<Airport> getAllAirports();
}
