package com.ecommerce.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity 
@Table(name="productdetails")
public class ProductBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	Long uniqueId;

	@Column(name = "PRODUCT_ID")
	private String productId;

	@Column(name = "PRODUCT_IMAGE")
	private String productImage;

	@Column(name = "PRODUCT_TYPE")
	private String productType;

	@Column(name = "PRODUCT_PRICE")
	private long productPrice;

	@Column(name = "PRODUCT_COLOR")
	private String productColor;

	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription;
	
	
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
	 * @return the productImage
	 */
	public String getProductImage() {
		return productImage;
	}

	/**
	 * @param productImage the productImage to set
	 */
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
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

	/**
	 * @return the productColor
	 */
	public String getProductColor() {
		return productColor;
	}

	/**
	 * @param productColor the productColor to set
	 */
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	


	
	
	
}
