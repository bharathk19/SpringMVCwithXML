package com.learning.springmvcthroughxml.demo.practise;

public class HelloExt extends Hello {
	
	public HelloExt()
	{
		super();
		//HelloExt(1);
		
	}
	
	

	public HelloExt(int i)
	{
		System.out.println("In argument parameter of the constructore "+i);
		display("the messgage from the HelloExt");
	}
	
	public static void main(String args[])
	{
		HelloExt hel = new HelloExt();
	}
	

}
