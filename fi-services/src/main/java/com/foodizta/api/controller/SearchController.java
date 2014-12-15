package com.foodizta.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items/")
public class SearchController {

	@RequestMapping(value = "/{zip}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseDto findItemsByZip() {
		
	}
}
