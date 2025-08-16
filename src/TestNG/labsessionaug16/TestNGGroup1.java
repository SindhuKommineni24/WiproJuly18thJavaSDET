/*Write a TestNG class with three methods:
loginTest → belongs to Smoke group
paymentTest → belongs to Regression group
logoutTest → belongs to both Smoke and Regression groups
Run only Smoke tests using testng.xml.
*/




package com.wiprojuly.testing;

import org.testng.annotations.Test;

public class TestNGGroup1 {
	
	@Test (groups= {"smoke"})
	public void login() {
		System.out.println("login testcase");
	}
	
	@Test (groups= {"Regression"})
	public void payment() {
		System.out.println("login testcase");
	}
	
	@Test (groups= {"Smoke","Regression"})
	public void logout() {
		System.out.println("login testcase");
	}
}
