package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ecommerce.persistence.RegistrationBean;
 

@Repository
public class RegistrationDaoImpl extends  HibernateDaoSupport implements RegistrationDao {

 	 
 	@Autowired
 	public void init(SessionFactory factory) {
 		 
 	    setSessionFactory(factory);
 	}
	/*public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

 	
	public void addCustomer(RegistrationBean customer) {
		// TODO Auto-generated method stub
		 
		getHibernateTemplate().save(customer);
	}

	public List<RegistrationBean> findAllCustomer() {
		// TODO Auto-generated method stub
		String ps = "FROM RegistrationBean";
		Query query = getSessionFactory().openSession().createQuery(ps);
		return (List<RegistrationBean>) query.list();
	}

}
