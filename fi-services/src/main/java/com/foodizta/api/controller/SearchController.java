package com.foodizta.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.foodizta.api.model.ResponseDto;
import com.foodizta.api.service.IItemService;

/**
 * The Class SearchController.
 */
@RestController
@RequestMapping("/items/")
public class SearchController {
	
	/** The item service. */
	@Autowired
	private IItemService itemService;

	/**
	 * Find items by zip.
	 *
	 * @param zip the zip
	 * @return the response dto
	 */
	@RequestMapping(value = "/{zip}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseDto findItemsByZip(@PathVariable String zip) {
		return itemService.getItemsByAreaCode(zip);
	}
}
