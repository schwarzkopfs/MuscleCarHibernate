package com.bluebik.car.musclecar;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Copyright © 2016 Bluebik Group. Created by khakhanat on 24/10/2017 AD.
 */

@Transactional
@Repository
public class MuscleCarDaoImpl implements MuscleCarDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public MuscleCar getCarFromList(int id) {
		return entityManager.find(MuscleCar.class, id);
	}

	@Override
	public void removeCarFromList(int id) {
		entityManager.remove(entityManager.find(MuscleCar.class, id));
	}

	@Override
	public void addCarToList(MuscleCar muscleCar) {
		entityManager.persist(muscleCar);
	}

	@Override
	public void updateCarFromList(int id, MuscleCar muscleCar) {
		muscleCar.setId(id);
		entityManager.merge(muscleCar);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MuscleCar> listAllCars() {
		Query query = entityManager.createNativeQuery("SELECT * FROM MUSCLE_CAR");
		return query.getResultList();
	}

}
