package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	
	private int customerId;
	private String customeName;
	private int customerPhone;
	private String customerAddress;
	private String customerLoginId;
	private int customerPassword;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerLoginId() {
		return customerLoginId;
	}
	public void setCustomerLoginId(String customerLoginId) {
		this.customerLoginId = customerLoginId;
	}
	public int getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(int customerPassword) {
		this.customerPassword = customerPassword;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customeName=" + customeName + ", customerPhone="
				+ customerPhone + ", customerAddress=" + customerAddress + ", customerLoginId=" + customerLoginId
				+ ", customerPassword=" + customerPassword + "]";
	}
	
	

}
