package com.monitoredrx.patientservice.controller.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.monitoredrx.patientservice.controller.dto.PatientAddressDto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetPatientResponse {

	private Long id;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("phone_number")
	private String phoneNumber;
	
	private String email;
	
	private PatientAddressDto address;
}
