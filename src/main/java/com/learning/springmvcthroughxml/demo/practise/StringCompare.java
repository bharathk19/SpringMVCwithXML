package com.learning.springmvcthroughxml.demo.practise;

public class StringCompare {

	public static void main(String[] args) {
		StringCompare str1 = new StringCompare();
		System.out.println(str1.CompareStrManually("Bharath", "Bharat"));
	}
	
	public boolean CompareStrManually(String strName1,String strName2) {
		if(strName1.length()==strName2.length()) {
			for(int i = 0;i<strName1.length();i++)
			{
				if(strName1.charAt(i)==strName1.charAt(i))
					return true;
				else
					return false;
			}
		}
		else
		{
			return false;
		}
		return false;
	}
}
