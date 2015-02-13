package com.ecommerce.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.RegistrationDAO;
import com.ecommerce.persistence.EcommerceUserDetails;

@Service
public class RegistrationBoImpl implements RegistrationBO {

	@Autowired
	RegistrationDAO registrationDAO;
	
	public void setCustomerDao(RegistrationDAO customerDao) {
		this.registrationDAO = customerDao;
	}
	
	 
	public void addCustomer(EcommerceUserDetails customer) {
		// TODO Auto-generated method stub

		registrationDAO.addCustomer(customer);
	}

	public List<EcommerceUserDetails> findAllCustomer() {
		// TODO Auto-generated method stub
		return registrationDAO.findAllCustomer();
	}

}
