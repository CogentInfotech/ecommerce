package com.ecommerce.dao;

import java.util.Date;
import java.util.List;
 



import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ecommerce.persistence.EcommerceUserDetails;
 

@Repository
public class RegistrationDaoImpl extends  HibernateDaoSupport implements RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	public void addCustomer(EcommerceUserDetails customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(customer);
	}

	public List<EcommerceUserDetails> findAllCustomer() {
		// TODO Auto-generated method stub
		String ps = "FROM userdetails";
		Query query = getSessionFactory().openSession().createQuery(ps);
		return (List<EcommerceUserDetails>) query.list();
	}

}
