package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.INutrientDao;
import com.foodizta.api.domain.Nutrient;

// TODO: Auto-generated Javadoc
/**
 * The Class NutrientDaoImpl.
 */
@Repository
public class NutrientDaoImpl extends GenericDaoImpl<Nutrient, Long> implements
		INutrientDao {

	/**
	 * Instantiates a new nutrient dao impl.
	 *
	 * @param sessionFactory the session factory
	 */
	@Autowired
	public NutrientDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
