package com.vodafone.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int eid;
	private String ename;

	private Address address;
	
	
	
	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("employe obj created and address injected");
	}

	public Employee() {

		System.out.println("employee obj created..");
	}

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
}
