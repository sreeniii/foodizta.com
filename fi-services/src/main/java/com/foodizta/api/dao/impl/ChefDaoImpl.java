package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IChefDao;
import com.foodizta.api.domain.Chef;

@Repository
public class ChefDaoImpl extends GenericDaoImpl<Chef, Long> implements IChefDao {

	@Autowired
	public ChefDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
