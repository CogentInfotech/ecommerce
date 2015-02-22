package com.ecommerce.persistence;

import java.util.ArrayList;
import java.util.List;

public class AddToCartBean {
	
	List listOfProductBean = new ArrayList<ProductBean>();

	/**
	 * @return the listOfProductBean
	 */
	public List getListOfProductBean() {
		return listOfProductBean;
	}

	/**
	 * @param listOfProductBean the listOfProductBean to set
	 */
	public void setListOfProductBean(List listOfProductBean) {
		this.listOfProductBean = listOfProductBean;
	}

}
