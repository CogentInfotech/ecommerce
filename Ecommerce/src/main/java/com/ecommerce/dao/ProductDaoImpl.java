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
	public List<ProductBean> findAllProducts(String keyWord){
		// TODO Auto-generated method stub
		
		String ps = "FROM ProductBean";
		Query query = getSessionFactory().openSession().createQuery(ps);
	//	query.setParameter("p1", keyWord);
		return (List<ProductBean>) query.list();
	}

}
