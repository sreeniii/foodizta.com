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

@Entity
@Table(name = "chef")
public class Chef extends PersistentEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "intro")
	private String intro;
	
	@Column(name="image_url")
	private String imageUrl;

	@Column(name = "description")
	private String description;

	@Column(name = "updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;

	/** The items. */
	@OneToMany(mappedBy = "chef", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Item> items = new HashSet<Item>();
	
	@OneToMany(mappedBy = "chef", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<AreasTargeted> areasTargeted = new HashSet<AreasTargeted>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<AreasTargeted> getAreasTargeted() {
		return areasTargeted;
	}

	public void setAreasTargeted(Set<AreasTargeted> areasTargeted) {
		this.areasTargeted = areasTargeted;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
