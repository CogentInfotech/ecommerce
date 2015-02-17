package com.ecommerce.web.bean;

public class SearchBean {
	
	
	private String searchQuery=null;

	public SearchBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSearchQuery() {
		return searchQuery;
	}

	public void setSearchQuery(String searchQuery) {
		this.searchQuery = searchQuery;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((searchQuery == null) ? 0 : searchQuery.hashCode());
		return result;
	}

 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SearchBean)) {
			return false;
		}
		SearchBean other = (SearchBean) obj;
		if (searchQuery == null) {
			if (other.searchQuery != null) {
				return false;
			}
		} else if (!searchQuery.equals(other.searchQuery)) {
			return false;
		}
		return true;
	}

	

}
