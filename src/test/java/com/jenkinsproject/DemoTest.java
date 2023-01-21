package com.jenkinsproject;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups="smoke")
	public void Test1()
	{
		System.out.println("--Test1--");
	}

}
