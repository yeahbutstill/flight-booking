package com.dxbair.services.flightbooking.domain.repo;

import com.dxbair.services.flightbooking.domain.entity.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface FlightBookingRepository extends JpaRepository<FlightBooking, String> {

	List<FlightBooking> findByPassengerId(String passengerId);
}
