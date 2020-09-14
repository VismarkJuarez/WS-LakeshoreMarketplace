package com.lakeshoremarketplace.model;

public class Item {
	private long itemId;
	private String description;
	private int quantity;
	private long unitOfMeasure;
	private double sellingPrice;
	private String image; //TODO: Hold a string leading to the image in the project directory
	private String longDescription; //TODO i.e. description details
	private long partnerId;
	private long taxCode;
	
	/**
	 * Default constructor using member variables
	 * */
	public Item(long itemId, String description, int quantity, long unitOfMeasure, double sellingPrice, String image,
			String longDescription, long partnerId, long taxCode) {
		super();
		this.itemId = itemId;
		this.description = description;
		this.quantity = quantity;
		this.unitOfMeasure = unitOfMeasure;
		this.sellingPrice = sellingPrice;
		this.image = image;
		this.longDescription = longDescription;
		this.partnerId = partnerId;
		this.taxCode = taxCode;
	}
	
	/**
	 * Getter and Setter methods:
	 * */
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(long unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(long partnerId) {
		this.partnerId = partnerId;
	}
	public long getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(long taxCode) {
		this.taxCode = taxCode;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	
}
