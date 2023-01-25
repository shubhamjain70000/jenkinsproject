package com.jenkinsproject;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups="smoke")
	public void Test1()
	{
		System.out.println("--Test1--");
	}
	
	@Test(groups="smoke")
	public void Test6()
	{
		System.out.println("--Test6--");
	}
	
	@Test(groups="smoke")
	public void Test7()
	{
		System.out.println("--Test7--");
		System.out.println("hii");
		System.out.println("Byee");
	}
	

}
