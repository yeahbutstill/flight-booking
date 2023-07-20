package com.dxbair.services.flightbooking.passenger;

import com.dxbair.services.flightbooking.domain.entity.Passenger;
import com.dxbair.services.flightbooking.domain.repo.PassengerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class PassengerServiceImpl implements PassengerService {

	private final PassengerRepository passengerRepo;

	public PassengerServiceImpl(PassengerRepository passengerRepo) {
		this.passengerRepo = passengerRepo;
	}

	@Override
	public Passenger getPassengerById(String passengerId) {
		return passengerRepo.findById(passengerId).orElseThrow(() -> new PassengerNotFoundException(passengerId));
	}

	@Override
	public List<Passenger> getAllPassengers() {
		return passengerRepo.findAll();
	}

}
