package com.foodizta.api.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

// TODO: Auto-generated Javadoc
/**
 * The Class Chef.
 */
@Entity
@Table(name = "chef")
public class Chef extends PersistentEntity {

	/** The name. */
	@Column(name = "name")
	private String name;

	/** The intro. */
	@Column(name = "intro")
	private String intro;
	
	/** The image url. */
	@Column(name="image_url")
	private String imageUrl;

	/** The description. */
	@Column(name = "description")
	private String description;

	/** The updated. */
	@Column(name = "updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

	/** The items. */
	@OneToMany(mappedBy = "chef", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Item> items = new HashSet<Item>();
	
	/** The areas targeted. */
	@OneToMany(mappedBy = "chef", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<AreasTargeted> areasTargeted = new HashSet<AreasTargeted>();

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
	 * Gets the intro.
	 *
	 * @return the intro
	 */
	public String getIntro() {
		return intro;
	}

	/**
	 * Sets the intro.
	 *
	 * @param intro the new intro
	 */
	public void setIntro(String intro) {
		this.intro = intro;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the updated.
	 *
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * Sets the updated.
	 *
	 * @param updated the new updated
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
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

	/**
	 * Gets the areas targeted.
	 *
	 * @return the areas targeted
	 */
	public Set<AreasTargeted> getAreasTargeted() {
		return areasTargeted;
	}

	/**
	 * Sets the areas targeted.
	 *
	 * @param areasTargeted the new areas targeted
	 */
	public void setAreasTargeted(Set<AreasTargeted> areasTargeted) {
		this.areasTargeted = areasTargeted;
	}

	/**
	 * Gets the image url.
	 *
	 * @return the image url
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * Sets the image url.
	 *
	 * @param imageUrl the new image url
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
