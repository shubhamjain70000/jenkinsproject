package com.jenkinsproject;

import org.testng.annotations.Test;

public class Demo7_Test {
	
	@Test
	public void create()
	{
		System.out.println("--created--");
	}
	
	@Test
	public void update()
	{
		System.out.println("--updated--");
	}
	
	@Test
	public void delete()
	{
		System.out.println("--deleted--");
	}

}
