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

// TODO: Auto-generated Javadoc
/**
 * The Class Item.
 */
@Entity
@Table(name="item")
public class Item extends PersistentEntity {

	/** The name. */
	@Column(name="name")
	private String name;
	
	/** The short description. */
	@Column(name="short_description")
	private String shortDescription;
	
	/** The description. */
	@Column(name="description")
	private String description;
	
	/** The image url. */
	@Column(name="image_url")
	private String imageUrl;
	
	/** The magento url. */
	@Column(name="magento_url")
	private String magentoUrl;
	
	/** The item type. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_type_id", nullable = false)
	private ItemType itemType;
	
	/** The price. */
	@Column(name="price")
	private BigDecimal price;
	
	/** The chef. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "chef_id", nullable = false)
	private Chef chef;
	
	/** The updated. */
	@Column(name="updated")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updated;
	
	/** The reviews. */
	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Review> reviews = new HashSet<Review>();
	
	/** The item ingredients. */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "item_ingredient", joinColumns = { 
		@JoinColumn(name = "ITEM_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "INGREDIENT_ID", 
	   	    nullable = false, updatable = false) })
	private Set<Ingredient> itemIngredients = new HashSet<Ingredient>();
	
	/** The item nutrients. */
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "item_nutrient", joinColumns = { 
		@JoinColumn(name = "ITEM_ID", nullable = false, updatable = false) }, 
			inverseJoinColumns = { @JoinColumn(name = "NUTRIENT_ID", 
	   	    nullable = false, updatable = false) })
	private Set<Nutrient> itemNutrients = new HashSet<Nutrient>();

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
	 * Gets the short description.
	 *
	 * @return the short description
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * Sets the short description.
	 *
	 * @param shortDescription the new short description
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
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
	 * Gets the price.
	 *
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
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
	 * Gets the reviews.
	 *
	 * @return the reviews
	 */
	public Set<Review> getReviews() {
		return reviews;
	}

	/**
	 * Sets the reviews.
	 *
	 * @param reviews the new reviews
	 */
	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	/**
	 * Gets the item ingredients.
	 *
	 * @return the item ingredients
	 */
	public Set<Ingredient> getItemIngredients() {
		return itemIngredients;
	}

	/**
	 * Sets the item ingredients.
	 *
	 * @param itemIngredients the new item ingredients
	 */
	public void setItemIngredients(Set<Ingredient> itemIngredients) {
		this.itemIngredients = itemIngredients;
	}

	/**
	 * Gets the item nutrients.
	 *
	 * @return the item nutrients
	 */
	public Set<Nutrient> getItemNutrients() {
		return itemNutrients;
	}

	/**
	 * Sets the item nutrients.
	 *
	 * @param itemNutrients the new item nutrients
	 */
	public void setItemNutrients(Set<Nutrient> itemNutrients) {
		this.itemNutrients = itemNutrients;
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

	/**
	 * Gets the item type.
	 *
	 * @return the item type
	 */
	public ItemType getItemType() {
		return itemType;
	}

	/**
	 * Sets the item type.
	 *
	 * @param itemType the new item type
	 */
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	/**
	 * Gets the magento url.
	 *
	 * @return the magento url
	 */
	public String getMagentoUrl() {
		return magentoUrl;
	}

	/**
	 * Sets the magento url.
	 *
	 * @param magentoUrl the new magento url
	 */
	public void setMagentoUrl(String magentoUrl) {
		this.magentoUrl = magentoUrl;
	}
}
