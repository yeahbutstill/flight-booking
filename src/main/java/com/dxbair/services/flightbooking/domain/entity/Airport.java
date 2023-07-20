package com.dxbair.services.flightbooking.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Airport {

	@Id
	private String iataCode;

	@NotEmpty
	@NotBlank
	private String name;

	@NotEmpty
	@NotBlank
	private String countryIsoCode;

	public Airport() {
		super();
	}

	public Airport(String iataCode, String name, String countryIsoCode) {
		super();
		this.iataCode = iataCode;
		this.name = name;
		this.countryIsoCode = countryIsoCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryIsoCode() {
		return countryIsoCode;
	}

	public void setCountryIsoCode(String countryIsoCode) {
		this.countryIsoCode = countryIsoCode;
	}

}
