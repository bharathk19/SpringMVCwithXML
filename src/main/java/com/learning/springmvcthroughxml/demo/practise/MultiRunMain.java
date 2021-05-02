package com.learning.springmvcthroughxml.demo.practise;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiRunMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String ");
		String str = scanner.next();
		String[] str1 = str.split(",");
		long time = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(str1.length);
		
		int i=0;
		for(String str2: str1)
		{ 	
			Runnable r = new MultiRun(str2,"Thread"+i);
			i++;
			executor.submit(r);
		}
		System.out.println(executor.toString());
		System.out.println(System.currentTimeMillis()-time);
		executor.shutdown();
		System.out.println(System.currentTimeMillis()-time);
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

}
