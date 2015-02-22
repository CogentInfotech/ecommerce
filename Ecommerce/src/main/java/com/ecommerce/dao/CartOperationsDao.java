package com.ecommerce.dao;

import com.ecommerce.persistence.ProductBean;

public interface CartOperationsDao {

	public boolean addToCart(ProductBean bean);
}
