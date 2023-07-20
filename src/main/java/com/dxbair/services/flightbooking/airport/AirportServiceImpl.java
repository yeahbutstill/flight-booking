package com.dxbair.services.flightbooking.airport;

import com.dxbair.services.flightbooking.domain.entity.Airport;
import com.dxbair.services.flightbooking.domain.repo.AirportRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AirportServiceImpl implements AirportService {

	private final AirportRepository airportRepo;

	public AirportServiceImpl(AirportRepository airportRepo) {
		this.airportRepo = airportRepo;
	}

	@Override
	public Airport getAirportById(String airportId) {
		return airportRepo.findById(airportId).orElseThrow(() -> new AirportNotFoundException(airportId));
	}

	@Override
	public List<Airport> getAllAirports() {
		return airportRepo.findAll();
	}

}
