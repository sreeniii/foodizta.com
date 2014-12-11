package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IChefDao;
import com.foodizta.api.domain.Chef;

@Repository
public class ChefDaoImpl extends GenericDaoImpl<Chef, Long> implements IChefDao {

	public ChefDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
