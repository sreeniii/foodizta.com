package com.foodizta.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodizta.api.dao.IAreasTargetedDao;
import com.foodizta.api.model.ItemDto;
import com.foodizta.api.model.ResponseDto;
import com.foodizta.api.service.IItemService;

// TODO: Auto-generated Javadoc
/**
 * The Class ItemServiceImpl.
 */
@Service
public class ItemServiceImpl implements IItemService {

	/** The areas targeted dao. */
	private IAreasTargetedDao areasTargetedDao;

	/**
	 * Instantiates a new item service impl.
	 *
	 * @param areasTargetedDao the areas targeted dao
	 */
	@Autowired
	public ItemServiceImpl(IAreasTargetedDao areasTargetedDao) {
		this.areasTargetedDao = areasTargetedDao;
	}

	/* (non-Javadoc)
	 * @see com.foodizta.api.service.IItemService#getItemsByAreaCode(java.lang.String)
	 */
	public ResponseDto getItemsByAreaCode(String zipCode) {
		ResponseDto responseDto = new ResponseDto();
		try {
			List<ItemDto> itemDtoList = areasTargetedDao.getItemsByAreaCode(zipCode);
			responseDto.setStatus("success");
			responseDto.setData(itemDtoList);
		} catch (Exception e) {
			responseDto.setStatus("error");
			responseDto.setMessage(e.getMessage());
		}

		return responseDto;
	}
}
