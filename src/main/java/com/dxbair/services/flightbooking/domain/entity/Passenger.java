package com.dxbair.services.flightbooking.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames="email"))
public class Passenger {

	@Id
	@GeneratedValue(generator = "passenger-id-gen")
    @GenericGenerator(name = "passenger-id-gen", 
      parameters = @Parameter(name = "prefix", value = "PS"), 
      strategy = "com.dxbair.services.flightbooking.domain.util.StringSequenceIdGenerator")
	private String id;

	@NotEmpty
	@NotBlank
	private String firstName;

	@NotEmpty
	@NotBlank
	private String lastName;

	@NotEmpty
	@NotBlank
	@Email
	private String email;

	public Passenger() {
		super();
	}

	public Passenger(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
