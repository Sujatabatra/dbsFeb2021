package com.sujata.bean;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement Belong to JAX-B ( Java API for XML Binding) which is used to convert Java Objects to XML and XML Back to java objects
@XmlRootElement
public class User {

	private int uId;
	private String uName;
	
	public User() {
		
	}

	public User(int uId, String uName) {
		super();
		this.uId = uId;
		this.uName = uName;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}
	

}
