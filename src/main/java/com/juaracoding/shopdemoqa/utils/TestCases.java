package com.juaracoding.shopdemoqa.utils;

public enum TestCases {
	T1("Create new account"),
	T2("Input username and password"),
	T3("Order the shoes"),
	T4("Order the glass"),
	T5("checkout all stuff at cart");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
