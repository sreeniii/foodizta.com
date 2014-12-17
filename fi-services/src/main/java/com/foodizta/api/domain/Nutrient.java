package com.foodizta.api.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Nutrient.
 */
@Entity
@Table(name = "nutrient")
public class Nutrient extends PersistentEntity {

	/** The name. */
	@Column(name = "name")
	private String name;

	/** The items. */
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "itemNutrients")
	private Set<Item> items = new HashSet<Item>();

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the items.
	 *
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}

	/**
	 * Sets the items.
	 *
	 * @param items the new items
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}
}
