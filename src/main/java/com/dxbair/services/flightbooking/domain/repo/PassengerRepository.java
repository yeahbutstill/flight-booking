package com.dxbair.services.flightbooking.domain.repo;

import com.dxbair.services.flightbooking.domain.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional
public interface PassengerRepository extends JpaRepository<Passenger, String> {
	
	Optional<Passenger> findByEmail(String email);
	
}
