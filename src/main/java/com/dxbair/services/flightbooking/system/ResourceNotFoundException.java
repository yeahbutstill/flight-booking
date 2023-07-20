package com.dxbair.services.flightbooking.system;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
	
	@Serial
	private static final long serialVersionUID = 5962898215276911029L;

	public ResourceNotFoundException(String resourceType, String keyName, String keyValue) {
		super(resourceType + " with " + keyName + "[" + keyValue + "] not found in the system!");
	}

}
