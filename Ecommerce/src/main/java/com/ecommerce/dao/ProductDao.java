package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.persistence.ProductBean;
 


public interface ProductDao {
	void addCustomer( ProductBean productBean);
	List<ProductBean> findAllCustomer();
}
