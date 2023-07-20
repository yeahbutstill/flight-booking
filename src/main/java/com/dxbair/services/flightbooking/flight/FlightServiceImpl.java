package com.dxbair.services.flightbooking.flight;

import com.dxbair.services.flightbooking.domain.entity.Flight;
import com.dxbair.services.flightbooking.domain.repo.FlightRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FlightServiceImpl implements FlightService {

	private final FlightRepository flightRepo;

	public FlightServiceImpl(FlightRepository flightRepo) {
		this.flightRepo = flightRepo;
	}

	@Override
	public Flight getFlightById(String flightId) {
		return flightRepo.findById(flightId).orElseThrow(() -> new FlightNotFoundException(flightId));
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightRepo.findAll();
	}

}
