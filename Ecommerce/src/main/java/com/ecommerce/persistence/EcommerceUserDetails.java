package com.ecommerce.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EcommerceUserDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
    Long id;
	private String customerName;
	private String customerEmail;
	private int customerAge;
	private String customerPassword;
	private String customerDescription;
	private String customerJob;
	private String customerInterests;

	public EcommerceUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EcommerceUserDetails(String customerName, String customerEmail,
			int customerAge, String customerPassword,
			String customerDescription, String customerJob,
			String customerInterests) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerAge = customerAge;
		this.customerPassword = customerPassword;
		this.customerDescription = customerDescription;
		this.customerJob = customerJob;
		this.customerInterests = customerInterests;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	public String getCustomerJob() {
		return customerJob;
	}

	public void setCustomerJob(String customerJob) {
		this.customerJob = customerJob;
	}

	public String getCustomerInterests() {
		return customerInterests;
	}

	public void setCustomerInterests(String customerInterests) {
		this.customerInterests = customerInterests;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerAge;
		result = prime
				* result
				+ ((customerDescription == null) ? 0 : customerDescription
						.hashCode());
		result = prime * result
				+ ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime
				* result
				+ ((customerInterests == null) ? 0 : customerInterests
						.hashCode());
		result = prime * result
				+ ((customerJob == null) ? 0 : customerJob.hashCode());
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		result = prime
				* result
				+ ((customerPassword == null) ? 0 : customerPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EcommerceUserDetails other = (EcommerceUserDetails) obj;
		if (customerAge != other.customerAge)
			return false;
		if (customerDescription == null) {
			if (other.customerDescription != null)
				return false;
		} else if (!customerDescription.equals(other.customerDescription))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerInterests == null) {
			if (other.customerInterests != null)
				return false;
		} else if (!customerInterests.equals(other.customerInterests))
			return false;
		if (customerJob == null) {
			if (other.customerJob != null)
				return false;
		} else if (!customerJob.equals(other.customerJob))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPassword == null) {
			if (other.customerPassword != null)
				return false;
		} else if (!customerPassword.equals(other.customerPassword))
			return false;
		return true;
	} 

}
