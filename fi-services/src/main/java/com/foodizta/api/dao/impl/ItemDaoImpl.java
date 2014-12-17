package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IItemDao;
import com.foodizta.api.domain.Item;

@Repository
public class ItemDaoImpl extends GenericDaoImpl<Item, Long> implements IItemDao {

	@Autowired
	public ItemDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
