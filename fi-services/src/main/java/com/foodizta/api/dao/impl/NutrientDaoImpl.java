package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.INutrientDao;
import com.foodizta.api.domain.Nutrient;

@Repository
public class NutrientDaoImpl extends GenericDaoImpl<Nutrient, Long> implements
		INutrientDao {

	@Autowired
	public NutrientDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
