package com.ecommerce.persistence;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity 
@Table(name="productdetails")
public class ProductBean {
	private static final long serialVersionUID = 1L;
	
	
	@Id @GeneratedValue
    Long uniqueId;
	
	@Column(name = "PRODUCT_ID")
	private String productId = null;
	
	@Column(name = "PRODUCT_IMAGE")
	private String productImage =null;
	
	@Column(name = "PRODUCT_TYPE")
	private String productType=null;
	
	@Column(name = "PRODUCT_PRICE")
	private long productPrice ;
	
	@Column(name = "PRODUCT_COLOR")
	private String productColor = null;
	
	@Column(name = "PRODUCT_DESCRIPTION")
	private String productDescription = null;
	
	
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((productColor == null) ? 0 : productColor.hashCode());
		result = prime
				* result
				+ ((productDescription == null) ? 0 : productDescription
						.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productImage == null) ? 0 : productImage.hashCode());
		result = prime * result + (int) (productPrice ^ (productPrice >>> 32));
		result = prime * result
				+ ((productType == null) ? 0 : productType.hashCode());
		result = prime * result
				+ ((uniqueId == null) ? 0 : uniqueId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ProductBean)) {
			return false;
		}
		ProductBean other = (ProductBean) obj;
		if (productColor == null) {
			if (other.productColor != null) {
				return false;
			}
		} else if (!productColor.equals(other.productColor)) {
			return false;
		}
		if (productDescription == null) {
			if (other.productDescription != null) {
				return false;
			}
		} else if (!productDescription.equals(other.productDescription)) {
			return false;
		}
		if (productId == null) {
			if (other.productId != null) {
				return false;
			}
		} else if (!productId.equals(other.productId)) {
			return false;
		}
		if (productImage == null) {
			if (other.productImage != null) {
				return false;
			}
		} else if (!productImage.equals(other.productImage)) {
			return false;
		}
		if (productPrice != other.productPrice) {
			return false;
		}
		if (productType == null) {
			if (other.productType != null) {
				return false;
			}
		} else if (!productType.equals(other.productType)) {
			return false;
		}
		if (uniqueId == null) {
			if (other.uniqueId != null) {
				return false;
			}
		} else if (!uniqueId.equals(other.uniqueId)) {
			return false;
		}
		return true;
	}

	
	
	
}
