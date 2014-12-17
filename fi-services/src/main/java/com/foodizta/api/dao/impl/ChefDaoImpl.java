package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IChefDao;
import com.foodizta.api.domain.Chef;

// TODO: Auto-generated Javadoc
/**
 * The Class ChefDaoImpl.
 */
@Repository
public class ChefDaoImpl extends GenericDaoImpl<Chef, Long> implements IChefDao {

	/**
	 * Instantiates a new chef dao impl.
	 *
	 * @param sessionFactory the session factory
	 */
	@Autowired
	public ChefDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
