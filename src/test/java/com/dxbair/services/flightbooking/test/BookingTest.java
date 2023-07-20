package com.dxbair.services.flightbooking.test;

import com.dxbair.services.flightbooking.test.model.FlightBookingModel;
import com.dxbair.services.flightbooking.test.model.FlightBookingSummaryModel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class BookingTest {
	private static final Logger logger = LoggerFactory.getLogger(BookingTest.class);

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void getBookingByValidId_OK() {

		String bookingId = "FB-10";

		ResponseEntity<FlightBookingModel> bookingResponse = restTemplate.getForEntity(ApiUrls.BookingURL + bookingId,
				FlightBookingModel.class);

		Assertions.assertThat(bookingResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(bookingResponse.getBody()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody().getId()).isEqualTo(bookingId);
		Assertions.assertThat(bookingResponse.getBody().getPassenger()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody().getFlights()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody().getFlights()).isNotEmpty();

		logger.info("\n=============================\n\n");
		logger.info(">>>>>>>>>>>>>>>>>>>>Response = " + bookingResponse.getBody());
		logger.info("\n\n=============================\n");

	}

	@Test
	void getBookingByInValidId_NOT_FOUND() {

		String bookingId = "FB-1010";

		ResponseEntity<String> bookingResponse = restTemplate.getForEntity(ApiUrls.BookingURL + bookingId,
				String.class);

		Assertions.assertThat(bookingResponse.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);

		logger.info("\n=============================\n\n");
		logger.info(">>>>>>>>>>>>>>>>>>>>Response = " + bookingResponse.getBody());
		logger.info("\n\n=============================\n");

	}

	@Test
	void getBookingsByValidPassengerId_OK() {

		String passengerId = "PS-5";

		ResponseEntity<FlightBookingSummaryModel[]> bookingResponse = restTemplate
				.getForEntity(ApiUrls.BookingsURL + passengerId, FlightBookingSummaryModel[].class);

		Assertions.assertThat(bookingResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(bookingResponse.getBody()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody()).isNotEmpty();
		Assertions.assertThat(bookingResponse.getBody()[0].getBookingId()).isNotEmpty();

		logger.info("\n=============================\n\n");
		logger.info(">>>>>>>>>>>>>>>>>>>>Response = " + Arrays.toString(bookingResponse.getBody()));
		logger.info("\n\n=============================\n");

	}

	@Test
	void getMultiBookingsByValidPassengerId_OK() {

		String passengerId = "PS-4";

		ResponseEntity<FlightBookingSummaryModel[]> bookingResponse = restTemplate
				.getForEntity(ApiUrls.BookingsURL + passengerId + "&multi-flights=true", FlightBookingSummaryModel[].class);

		Assertions.assertThat(bookingResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
		Assertions.assertThat(bookingResponse.getBody()).isNotNull();
		Assertions.assertThat(bookingResponse.getBody()).isNotEmpty();
		Assertions.assertThat(bookingResponse.getBody()[0].getBookingId()).isNotEmpty();

		logger.info("\n=============================\n\n");
		logger.info(">>>>>>>>>>>>>>>>>>>>Response = " + Arrays.toString(bookingResponse.getBody()));
		logger.info("\n\n=============================\n");

	}

	@Test
	void getBookingsByInValidPassengerId_NOT_FOUND() {

		String passengerId = "ABC-5";

		ResponseEntity<String> bookingResponse = restTemplate.getForEntity(ApiUrls.BookingsURL + passengerId,
				String.class);

		Assertions.assertThat(bookingResponse.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);

		logger.info("\n=============================\n\n");
		logger.info(">>>>>>>>>>>>>>>>>>>>Response = " + bookingResponse.getBody());
		logger.info("\n\n=============================\n");

	}
}
