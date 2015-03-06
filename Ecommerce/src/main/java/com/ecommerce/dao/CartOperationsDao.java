package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.persistence.CartBean;

public interface CartOperationsDao {

	public boolean addToCart(CartBean bean);
	public List<CartBean> retrieveCart(String sessionId);
	
	public boolean deleteCart(String sessionId);
	public boolean removeFromCart(String productId);
}
