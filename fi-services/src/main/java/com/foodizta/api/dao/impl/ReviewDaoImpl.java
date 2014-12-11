package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IReviewDao;
import com.foodizta.api.domain.Review;

@Repository
public class ReviewDaoImpl extends GenericDaoImpl<Review, Long> implements IReviewDao {

	public ReviewDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
