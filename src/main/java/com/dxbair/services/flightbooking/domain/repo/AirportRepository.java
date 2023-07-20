package com.dxbair.services.flightbooking.domain.repo;

import com.dxbair.services.flightbooking.domain.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface AirportRepository extends JpaRepository<Airport, String> {
	
}
