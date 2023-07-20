package com.dxbair.services.flightbooking.passenger;

import com.dxbair.services.flightbooking.domain.entity.Passenger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("passengers")
public class PassengerController {

	private final PassengerService passengerService;

	private static final Logger logger = LoggerFactory.getLogger(PassengerController.class);

	public PassengerController(PassengerService passengerService) {
		this.passengerService = passengerService;
	}

	@GetMapping
	public @ResponseBody List<Passenger> getAllPassengers() {
		return passengerService.getAllPassengers();
	}

	@GetMapping("/{passenger-id}")
	public @ResponseBody Passenger getPassengerById(@PathVariable("passenger-id") String passengerId) {
		return passengerService.getPassengerById(passengerId);
	}
}
