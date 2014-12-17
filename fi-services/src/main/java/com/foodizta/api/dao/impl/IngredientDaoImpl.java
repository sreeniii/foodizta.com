package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IIngredientDao;
import com.foodizta.api.domain.Ingredient;

// TODO: Auto-generated Javadoc
/**
 * The Class IngredientDaoImpl.
 */
@Repository
public class IngredientDaoImpl extends GenericDaoImpl<Ingredient, Long> implements
		IIngredientDao {

	/**
	 * Instantiates a new ingredient dao impl.
	 *
	 * @param sessionFactory the session factory
	 */
	@Autowired
	public IngredientDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
