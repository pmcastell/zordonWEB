package com.zordonweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zordonweb.entities.Hospital;

@RestController
@RequestMapping("/zordon")
public class HospitalController {

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public List<Hospital> getAllHospitals() {
		return Arrays.asList(new Hospital(1, "Virgen de Altagracia2"), new Hospital(2, "Virgen de Altagracia"),
				new Hospital(3, "Virgen de Altagracia2"));
	}

}
