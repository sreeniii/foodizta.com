package com.foodizta.api.service;

import com.foodizta.api.model.ResponseDto;

// TODO: Auto-generated Javadoc
/**
 * The Interface IItemService.
 */
public interface IItemService {

	/**
	 * Gets the items by area code.
	 *
	 * @param zipCode the zip code
	 * @return the items by area code
	 */
	public ResponseDto getItemsByAreaCode(String zipCode);
}
