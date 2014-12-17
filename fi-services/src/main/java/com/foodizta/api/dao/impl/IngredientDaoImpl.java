package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IIngredientDao;
import com.foodizta.api.domain.Ingredient;

@Repository
public class IngredientDaoImpl extends GenericDaoImpl<Ingredient, Long> implements
		IIngredientDao {

	@Autowired
	public IngredientDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
