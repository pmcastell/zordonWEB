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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/zordon")
@Api(value = "hostpitales")
public class HospitalController {

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Devuelve todos los hospitales", notes = "Devuelve todos")
	@ApiResponses({ @ApiResponse(code = 200, message = "Hospitales encontrados") })
	public List<Hospital> getAllHospitals() {
		return Arrays.asList(new Hospital(1, "Virgen de Altagracia"), new Hospital(2, "Virgen de Altagracia"),
				new Hospital(3, "Virgen de Altagracia2"));
	}

}
