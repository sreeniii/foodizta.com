package com.foodizta.api.service;

import com.foodizta.api.model.ResponseDto;

public interface IItemService {

	public ResponseDto getItemsByAreaCode(String zipCode);
}
