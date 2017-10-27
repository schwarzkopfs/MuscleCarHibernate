package com.bluebik.car.musclecar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Copyright © 2016 Bluebik Group. Created by khakhanat on 24/10/2017 AD.
 */

@Entity
@Table(name = "MUSCLE_CAR")
public class MuscleCar {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "CAR_BRAND")
	private String carBrand;

	@Column(name = "CAR_MODEL")
	private String carModel;

	@Column(name = "HORSEPOWER")
	private String horsepower;

	@Column(name = "CAR_ENGINE")
	private String carEngine;

	public MuscleCar() {

	}

	public MuscleCar(String carBrand, String carModel, String horsepower, String carEngine) {
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.horsepower = horsepower;
		this.carEngine = carEngine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}

	public String getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}
}
