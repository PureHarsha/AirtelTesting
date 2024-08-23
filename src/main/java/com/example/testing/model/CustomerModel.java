package com.example.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "CUSTOMER_DETAILS")
public class CustomerModel {

	@Id
	@Column (name = "CUSTOMER_NAME")
	private String CustName;
	
	@Column(name = "ADDRESS")
	private String addresS;
	
	@Column (name = "STATUS")
	private String statuS;

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public String getAddresS() {
		return addresS;
	}

	public void setAddresS(String addresS) {
		this.addresS = addresS;
	}

	public String getStatuS() {
		return statuS;
	}

	public void setStatuS(String statuS) {
		this.statuS = statuS;
	}
	
}
