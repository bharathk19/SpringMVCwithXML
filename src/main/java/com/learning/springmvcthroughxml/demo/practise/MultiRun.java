package com.learning.springmvcthroughxml.demo.practise;

import java.util.TreeSet;

public class MultiRun implements Runnable {
	private String name;
	private String threadName;
	
	@Override
	public  void  run() {
		try {
			TreeSet<String> strLoad = new TreeSet<String>();
			for(int i=0;i<name.length();i++)
			{
				for(int j = i+1; j<name.length();j++)
					strLoad.add(name.substring(i,j+1));
				//Thread.sleep(4000L);
			}
			System.out.println("Printing the string Info "+strLoad +"Thread used "+ threadName
					+" "+Thread.currentThread());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public MultiRun(String name, String threadName) {
		this.name = name;
		this.threadName = threadName;
	}
	
	

}
