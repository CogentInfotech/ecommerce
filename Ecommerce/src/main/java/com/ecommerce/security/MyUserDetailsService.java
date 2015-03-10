package com.ecommerce.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecommerce.persistence.RegistrationBean;


@Service(value = "MyUserDetailsService")
public class MyUserDetailsService extends HibernateDaoSupport implements
		UserDetailsService {

	@Autowired
	public void init(SessionFactory factory) {

		setSessionFactory(factory);
	}

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		RegistrationBean bean = null;
		String ps = "FROM RegistrationBean  where customerName =:p1";
		Query query = getSessionFactory().openSession().createQuery(ps);
		query.setParameter("p1", userName);

		List l2 = query.list();
		if (null != l2 && !l2.isEmpty()) {

			if (l2.get(0) instanceof RegistrationBean) {
				
				Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				
				bean = (RegistrationBean) l2.get(0); 
				if(bean.getRoleuser().equalsIgnoreCase("ROLE_NULL")){
					return null;
				}
				
				authorities.add(new GrantedAuthorityImpl(bean.getRoleuser())); // adding user role ROLE_USER
				
				User user = new User(bean.getCustomerName(),bean.getCustomerPassword(), authorities);
				
				return user;
			}

		}

		return null;

	}

}
