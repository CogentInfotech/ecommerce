package com.ecommerce.bo;

import java.util.List;

import com.ecommerce.persistence.EcommerceUserDetails;

public interface RegistrationBO {

	void addCustomer(EcommerceUserDetails customer);
	 
	List<EcommerceUserDetails> findAllCustomer();
}
