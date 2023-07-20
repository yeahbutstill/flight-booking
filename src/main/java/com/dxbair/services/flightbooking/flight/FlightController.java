package com.dxbair.services.flightbooking.flight;

import com.dxbair.services.flightbooking.domain.entity.Flight;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("flights")
public class FlightController {
	
	private final FlightService flightService;
	
	private static final Logger logger = LoggerFactory.getLogger(FlightController.class);

	public FlightController(FlightService flightService) {
		this.flightService = flightService;
	}

	@GetMapping
	public @ResponseBody List<Flight> getAllFlights() {
		return flightService.getAllFlights();
	}
	
	@GetMapping("/{flight-id}")
	public @ResponseBody Flight getFlightById(@PathVariable("flight-id") String flightId) {
		return flightService.getFlightById(flightId);
	}
}
