package com.zordonweb.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Entidad Hospital", description = "Contiene la información de un hospital")
public class Hospital {

	@ApiModelProperty(value = "Identificador del hospital")
	private Integer id;

	@ApiModelProperty(value = "Nombre del hospital")
	private String name;

	public Hospital(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Hospital() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
