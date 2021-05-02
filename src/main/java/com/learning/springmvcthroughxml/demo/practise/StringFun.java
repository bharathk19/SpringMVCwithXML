package com.learning.springmvcthroughxml.demo.practise;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StringFun  {
//banana,hjyghr,abadca,loiqwe
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String ");
		String str = scanner.next();
		String[] str1 = str.split(",");
		long time = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(str1.length);
		System.out.println(str1.length);
		System.out.println(executor.toString());
		executor.submit(() ->  {
			for(String str2: str1)
			{
				new StringFun().StringFunction(str2);
			}
		});
		System.out.println(executor.toString());
	
			executor.shutdown();
			scanner.close();
			if(!executor.isTerminated())
			{
				try {
					executor.awaitTermination(2, TimeUnit.MINUTES);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println((System.currentTimeMillis()-time));
			}	
	}

	private void StringFunction(String str2) {
		
		TreeSet<String> strLoad = new TreeSet<String>();
		for(int i=0;i<str2.length();i++)
		{
			for(int j = i+1; j<str2.length();j++)
				strLoad.add(str2.substring(i,j+1));
		}
		/*
		 * try { Thread.sleep(4000L); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		System.out.println("Printing the string Info "+strLoad +"Thread used "+Thread.currentThread());
	}

}
