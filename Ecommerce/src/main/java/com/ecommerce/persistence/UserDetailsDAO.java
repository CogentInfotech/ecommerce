package com.ecommerce.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserDetailsDAO {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void persist(EcommerceUserDetails userDetails) {
		em.persist(userDetails);
	}

	public List<EcommerceUserDetails> getAllEcommerceUserDetails() {
		TypedQuery<EcommerceUserDetails> query = em.createQuery(
				"SELECT g FROM EcommerceUserDetails g",
				EcommerceUserDetails.class);
		return query.getResultList();
	}

}
