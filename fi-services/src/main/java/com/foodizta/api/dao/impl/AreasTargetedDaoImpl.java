package com.foodizta.api.dao.impl;

import java.util.HashSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.foodizta.api.dao.IAreasTargetedDao;
import com.foodizta.api.domain.AreasTargeted;
import com.foodizta.api.model.ItemDto;

@Repository
public class AreasTargetedDaoImpl extends GenericDaoImpl<AreasTargeted, Long> implements
		IAreasTargetedDao {

	@Autowired
	public AreasTargetedDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}
	
	public List<ItemDto> getItemsByAreaCode(String zipCode) {
		Criteria criteria = getSession().createCriteria(AreasTargeted.class);
		criteria.add(Restrictions.eq("zip", zipCode));
		List<AreasTargeted> areasTargetedList = _findByCriteria(criteria);
		List<ItemDto> itemDtoList = ItemDto.prepareItemDto(new HashSet<AreasTargeted>(areasTargetedList));
		return itemDtoList;
	}


}
