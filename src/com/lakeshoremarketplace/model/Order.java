package com.lakeshoremarketplace.model;

public class Order {
	//TODO: Dates -- keep as String, or convert to Date
	private long orderId;
	private long customerId;
	private long shipToId;
	private String deliveryDate;
	private String shippingService;
	private String returnByDate;
	private String paymentType;
	private String paymentAuthorization;
	private String orderStatus;
	private String orderDateTime;
	
	/**
	 * Default constructor using member variables
	 * */
	public Order(long orderId, long customerId, long shipToId, String deliveryDate, String shippingService,
			String returnByDate, String paymentType, String paymentAuthorization, String orderStatus,
			String orderDateTime) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.shipToId = shipToId;
		this.deliveryDate = deliveryDate;
		this.shippingService = shippingService;
		this.returnByDate = returnByDate;
		this.paymentType = paymentType;
		this.paymentAuthorization = paymentAuthorization;
		this.orderStatus = orderStatus;
		this.orderDateTime = orderDateTime;
	}
	
	/**
	 * Getters and Setters
	 * */
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getShipToId() {
		return shipToId;
	}
	public void setShipToId(long shipToId) {
		this.shipToId = shipToId;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getShippingService() {
		return shippingService;
	}
	public void setShippingService(String shippingService) {
		this.shippingService = shippingService;
	}
	public String getReturnByDate() {
		return returnByDate;
	}
	public void setReturnByDate(String returnByDate) {
		this.returnByDate = returnByDate;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentAuthorization() {
		return paymentAuthorization;
	}
	public void setPaymentAuthorization(String paymentAuthorization) {
		this.paymentAuthorization = paymentAuthorization;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(String orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
}
