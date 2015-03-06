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

public class CartOperationsDaoImpl extends HibernateDaoSupport implements
		CartOperationsDao {

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
		String ps = "FROM CartBean where cartId =:p1";
		Query query = getSessionFactory().openSession().createQuery(ps);
		query.setParameter("p1", sessionId);
		return (List<CartBean>) query.list();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean deleteCart(String sessionId) {
		// TODO Auto-generated method stub
		Query query = getSessionFactory().openSession().createQuery(
				"delete CartBean where cartId = :p1");
		query.setParameter("p1", sessionId);
		int result = query.executeUpdate();
		if (result > 0) {
			return true;
		}
		return false;
	}

	/**
	 * This method delete cart products based on the product id.
	 */
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public boolean removeFromCart(String productId) {
		// TODO Auto-generated method stub
		Query query = getSessionFactory().openSession().createQuery(
				"delete from CartBean where productId = :p1");
		query.setParameter("p1", productId);
		int result = query.executeUpdate();
		if (result > 0) {
			return true;
		}
		return false;
	}

}
