package com.foodizta.api.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.foodizta.api.domain.AreasTargeted;
import com.foodizta.api.domain.Chef;
import com.foodizta.api.domain.Ingredient;
import com.foodizta.api.domain.Item;
import com.foodizta.api.domain.Nutrient;

public class ItemDto {
	
	private String name;
	
	private String chef;
	
	private String imageUrl;
	
	private BigDecimal price;
	
	private String itemType;
	
	private List<String> nutrients;
	
	private List<String> ingredients;
	
	private String shortDescription;
	
	private String description;
	
	private String magentoUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChef() {
		return chef;
	}

	public void setChef(String chef) {
		this.chef = chef;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public List<String> getNutrients() {
		return nutrients;
	}

	public void setNutrients(List<String> nutrients) {
		this.nutrients = nutrients;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMagentoUrl() {
		return magentoUrl;
	}

	public void setMagentoUrl(String magentoUrl) {
		this.magentoUrl = magentoUrl;
	}

	public static List<ItemDto> prepareItemDto(HashSet<AreasTargeted> areasTargetedList) {
		List<ItemDto> itemDtoList = new ArrayList<ItemDto>();
		for(AreasTargeted areasTargeted : areasTargetedList) {
			Chef chef = areasTargeted.getChef();
			for(Item item : chef.getItems()) {
				ItemDto itemDto = new ItemDto();
				itemDto.setName(item.getName());
				itemDto.setShortDescription(item.getShortDescription());
				itemDto.setDescription(item.getDescription());
				itemDto.setPrice(item.getPrice());
				itemDto.setItemType(item.getItemType().getName());
				itemDto.setImageUrl(item.getImageUrl());
				itemDto.setChef(chef.getName());
				itemDto.setMagentoUrl(item.getMagentoUrl());
				
				List<String> nutrients =  new ArrayList<String>();
				for(Nutrient nutrient : item.getItemNutrients()) {
					nutrients.add(nutrient.getName());
				}
				itemDto.setNutrients(nutrients);
				
				List<String> ingredients = new ArrayList<String>();
				for(Ingredient ingredient : item.getItemIngredients()) {
					ingredients.add(ingredient.getName());
				}
				itemDto.setIngredients(ingredients);
				
				itemDtoList.add(itemDto);
			}
		}
		return itemDtoList;
	}

}
