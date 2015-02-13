package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.persistence.EcommerceUserDetails;

public interface RegistrationDAO {

	void addCustomer(EcommerceUserDetails customer);
	 
	List<EcommerceUserDetails> findAllCustomer();
}
