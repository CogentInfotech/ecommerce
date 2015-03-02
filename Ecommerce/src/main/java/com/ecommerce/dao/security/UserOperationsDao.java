package com.ecommerce.dao.security;

public interface UserOperationsDao {

	public boolean enableUser(String userId); 
	public boolean disableUser(String userId); 
}
