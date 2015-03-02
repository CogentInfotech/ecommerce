package com.ecommerce.dao.security;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserOperationsDaoImpl extends HibernateDaoSupport implements UserOperationsDao {

	@Autowired
 	public void init(SessionFactory factory) {
 		 
 	    setSessionFactory(factory);
 	}
	
	@Override
	public boolean enableUser(String userId) {
		// TODO Auto-generated method stub
		if(!userId.equalsIgnoreCase("admin")){
		  Query query = getSessionFactory().openSession().createQuery("UPDATE RegistrationBean SET roleuser =:u1 where customerName =:p1");
		  query.setParameter("u1", "ROLE_USER");
		  query.setParameter("p1", userId);
		 int i =  query.executeUpdate(); 
		 if(i==1){
			 return true;
		 } 
		}
		return false;
	}

	@Override
	public boolean disableUser(String userId) {
		// TODO Auto-generated method stub
		if(!userId.equalsIgnoreCase("admin")){
		  Query query = getSessionFactory().openSession().createQuery("UPDATE RegistrationBean SET roleuser =:u1 where customerName =:p1");
		  query.setParameter("u1", "ROLE_NULL");
		  query.setParameter("p1", userId);
		 int i =  query.executeUpdate(); 
		 if(i==1){
			 return true;
		 } 
		}
		return false;
	}

}
