package com.zordonweb.entities;

public class Hospital {

	private Integer id;
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
