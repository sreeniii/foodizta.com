package com.foodizta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class ItemType.
 */
@Entity
@Table(name="item_type")
public class ItemType extends PersistentEntity {

	/** The name. */
	@Column(name="name")
	private String name;

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
}
