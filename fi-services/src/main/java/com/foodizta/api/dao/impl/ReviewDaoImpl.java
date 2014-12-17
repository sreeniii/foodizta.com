package com.foodizta.api.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IReviewDao;
import com.foodizta.api.domain.Review;

// TODO: Auto-generated Javadoc
/**
 * The Class ReviewDaoImpl.
 */
@Repository
public class ReviewDaoImpl extends GenericDaoImpl<Review, Long> implements IReviewDao {

	/**
	 * Instantiates a new review dao impl.
	 *
	 * @param sessionFactory the session factory
	 */
	@Autowired
	public ReviewDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

}
