package com.foodizta.api.dao;

import java.util.List;

import com.foodizta.api.domain.AreasTargeted;
import com.foodizta.api.model.ItemDto;

// TODO: Auto-generated Javadoc
/**
 * The Interface IAreasTargetedDao.
 */
public interface IAreasTargetedDao extends IGenericDao<AreasTargeted, Long> {

	/**
	 * Gets the items by area code.
	 *
	 * @param zipCode the zip code
	 * @return the items by area code
	 */
	public List<ItemDto> getItemsByAreaCode(String zipCode);
}
