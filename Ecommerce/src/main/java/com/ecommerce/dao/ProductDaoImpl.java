package com.ecommerce.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ecommerce.persistence.ProductBean;

@Repository
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	@Autowired
 	public void init(SessionFactory factory) {
 		 
 	    setSessionFactory(factory);
 	}
	
	@Override
	public void addCustomer(ProductBean productBean) {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().save(productBean);
	}

	@Override
	public List<ProductBean> findAllCustomer() {
		// TODO Auto-generated method stub
		
		String ps = "FROM productdetails";
		Query query = getSessionFactory().openSession().createQuery(ps);
		return (List<ProductBean>) query.list();
	}

}
