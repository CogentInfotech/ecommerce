package com.ecommerce.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity 
@Table(name="userdetails")
public class RegistrationBean implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id @GeneratedValue
    Long id;
	@Column(name = "USER_ID")//@Column(name = "ID", unique = true)	
	private long customerId;
	
	@Column(name = "USER_NAME")
	private String customerName;
	
	@Column(name = "USER_EMAIL")
	private String customerEmail;
	
	@Column(name = "USER_AGE")
	private int customerAge;
	
	@Column(name = "USER_PASSWORD")
	private String customerPassword;
	
	@Column(name = "USER_DESC")
	private String customerDescription;
	
	@Column(name = "USER_JOB")
	private String customerJob;
	
	@Column(name = "USER_INTRSTS")
	private String customerInterests;
	
	@Column(name = "ROLE")
	private String roleuser = "ROLE_USER";

	/**
	 * @return the roleuser
	 */
	public String getRoleuser() {
		return roleuser;
	}

	/**
	 * @param roleuser the roleuser to set
	 */
	public void setRoleuser(String roleuser) {
		this.roleuser = roleuser;
	}

	
	public RegistrationBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationBean(String customerName, String customerEmail,
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
		RegistrationBean other = (RegistrationBean) obj;
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
