package com.bluebik.car.musclecar;

import java.util.List;
import java.util.Map;

import com.bluebik.car.musclecar.MuscleCar;

/**
 * Copyright © 2016 Bluebik Group.
 * Created by khakhanat on 24/10/2017 AD.
 */
public interface MuscleCarDao {

    public MuscleCar getCarFromList(int id) throws RuntimeException;

    public void removeCarFromList(int id)throws RuntimeException;

    public void addCarToList(MuscleCar muscleCar) throws RuntimeException;

    public void updateCarFromList(int id, MuscleCar muscleCar) throws RuntimeException;

    public List<MuscleCar> listAllCars() throws RuntimeException;

}
