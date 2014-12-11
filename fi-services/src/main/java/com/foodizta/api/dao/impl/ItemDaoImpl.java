package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IItemDao;
import com.foodizta.api.domain.Item;

@Repository
public class ItemDaoImpl extends GenericDaoImpl<Item, Long> implements IItemDao {

	public ItemDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
