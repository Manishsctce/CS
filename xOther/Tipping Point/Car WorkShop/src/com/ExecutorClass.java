package com;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorClass {
	public static void execute(List<Employee> empList) {		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(Employee emp : empList)
			executor.submit(emp);
		
		executor.shutdown();
		try {
			executor.awaitTermination(10, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
}