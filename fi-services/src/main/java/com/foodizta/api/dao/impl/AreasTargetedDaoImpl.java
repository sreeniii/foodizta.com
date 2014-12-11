package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IAreasTargetedDao;
import com.foodizta.api.domain.AreasTargeted;

@Repository
public class AreasTargetedDaoImpl extends GenericDaoImpl<AreasTargeted, Long> implements
		IAreasTargetedDao {

	public AreasTargetedDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}


}
