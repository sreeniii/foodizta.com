package com.foodizta.api.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="item")
public class Item extends PersistentEntity {

	@Column(name="name")
	private String name;
	
	@Column(name="short_description")
	private String shortDescription;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private BigDecimal price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chef_id", nullable = false)
	private Chef chef;
	
	@Column(name="updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	
	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Review> reviews = new HashSet<Review>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "item_ingredient", joinColumns = { 
		@JoinColumn(name = "ITEM_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "INGREDIENT_ID", 
	   	    nullable = false, updatable = false) })
	private Set<Ingredient> itemIngredients = new HashSet<Ingredient>();
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "item_nutrient", joinColumns = { 
		@JoinColumn(name = "ITEM_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "NUTRIENT_ID", 
	   	    nullable = false, updatable = false) })
	private Set<Nutrient> itemNutrients = new HashSet<Nutrient>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	public Set<Ingredient> getItemIngredients() {
		return itemIngredients;
	}

	public void setItemIngredients(Set<Ingredient> itemIngredients) {
		this.itemIngredients = itemIngredients;
	}

	public Set<Nutrient> getItemNutrients() {
		return itemNutrients;
	}

	public void setItemNutrients(Set<Nutrient> itemNutrients) {
		this.itemNutrients = itemNutrients;
	}
}
