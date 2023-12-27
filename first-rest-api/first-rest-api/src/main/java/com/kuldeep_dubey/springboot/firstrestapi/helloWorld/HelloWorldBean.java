package com.kuldeep_dubey.springboot.firstrestapi.helloWorld;

public class HelloWorldBean {
	
	private String meassage;

	public HelloWorldBean(String meassage) {
		super();
		this.meassage = meassage;
	}

	public String getMeassage() {
		return meassage;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [meassage=" + meassage + "]";
	}

	

}
