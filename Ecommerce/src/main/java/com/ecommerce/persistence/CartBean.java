package com.ecommerce.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity 
@Table(name = "CART")
public class CartBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	Long uniqueId;

	@Column(name = "CART_ID")
	private String cartId;
	
	@Column(name = "CART_PRODUCT_ID")
	private String productId;
	
	@Column(name = "CART_PRODUCT_PRICE")
	private long productPrice;
	
	/**
	 * @return the uniqueId
	 */
	public Long getUniqueId() {
		return uniqueId;
	}

	/**
	 * @param uniqueId the uniqueId to set
	 */
	public void setUniqueId(Long uniqueId) {
		this.uniqueId = uniqueId;
	}

	/**
	 * @return the cartId
	 */
	public String getCartId() {
		return cartId;
	}

	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the productPrice
	 */
	public long getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}

	


}
