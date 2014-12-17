package com.foodizta.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class AreasTargeted.
 */
@Entity
@Table(name = "areas_targeted")
public class AreasTargeted extends PersistentEntity {

	/** The zip. */
	@Column(name="zip")
	private String zip;
	
	/** The chef. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chef_id", nullable = false)
	private Chef chef;

	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Gets the chef.
	 *
	 * @return the chef
	 */
	public Chef getChef() {
		return chef;
	}

	/**
	 * Sets the chef.
	 *
	 * @param chef the new chef
	 */
	public void setChef(Chef chef) {
		this.chef = chef;
	}
}
