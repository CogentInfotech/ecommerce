package com.ecommerce.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ecommerce.persistence.ProductBean;

public class CartOperationsDaoImpl extends HibernateDaoSupport implements CartOperationsDao {

	@Autowired
 	public void init(SessionFactory factory) {
 		 
 	    setSessionFactory(factory);
 	}
	
	
	@Override
	public boolean addToCart(ProductBean bean) {
		// TODO Auto-generated method stub
		
		return false;
	}
	

}
