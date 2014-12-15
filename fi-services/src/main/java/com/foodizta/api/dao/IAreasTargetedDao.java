package com.foodizta.api.dao;

import java.util.List;

import com.foodizta.api.domain.AreasTargeted;
import com.foodizta.api.model.ItemDto;

public interface IAreasTargetedDao extends IGenericDao<AreasTargeted, Long> {

	public List<ItemDto> getItemsByAreaCode(String zipCode);
}
