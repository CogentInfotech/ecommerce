package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.persistence.CartBean;
import com.ecommerce.persistence.ProductBean;

public class CartOperationsDaoImpl extends HibernateDaoSupport implements CartOperationsDao {

	@Autowired
 	public void init(SessionFactory factory) {
 		 
 	    setSessionFactory(factory);
 	}
	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean addToCart(CartBean bean) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(bean);
		return true;
	}


	/***
	 * Session ID is unique, So mapping multiple products with a Session ID will
	 * achieve the cart
	 */
	@Override
	public List<CartBean> retrieveCart(String sessionId) {
		// TODO Auto-generated method stub
		String ps = "FROM CartBean where productId =:p1";
		Query query = getSessionFactory().openSession().createQuery(ps);
	 	query.setParameter("p1", sessionId);
		return (List<CartBean>) query.list();
	}
	

}
