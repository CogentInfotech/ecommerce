package com.ecommerce.web.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.ecommerce.persistence.ProductBean;

@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class ShoppingCart implements Serializable{
	
	List listOfProductBeans = new ArrayList<ProductBean>();

	/**
	 * @return the listOfProductBeans
	 */
	public List getListOfProductBeans() {
		return listOfProductBeans;
	}

	/**
	 * @param listOfProductBeans the listOfProductBeans to set
	 */
	public void setListOfProductBeans(List listOfProductBeans) {
		this.listOfProductBeans = listOfProductBeans;
	}

}
