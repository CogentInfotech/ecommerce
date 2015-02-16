package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.persistence.RegistrationBean;

public interface RegistrationDao {

	void addCustomer(RegistrationBean customer);
	 
	List<RegistrationBean> findAllCustomer();
}
