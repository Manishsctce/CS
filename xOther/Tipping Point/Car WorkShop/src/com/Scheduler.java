package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Scheduler {
	List<Employee> emplist = new ArrayList<Employee>();
	List<Task> tasklist = new ArrayList<Task>();
	PriorityQueue<Task> priorityQueue ;
	
	public void initializer(){
		Task t1 = new Task("Car Wash",100,2);
		Task t2 = new Task("Car Repair",1000,5);
		Task t3 = new Task("Car Paint",1100,4);
		
		tasklist.add(t1);tasklist.add(t2);tasklist.add(t3);
		
		Employee e1 = new Employee("Joe", "Trainee");
		Employee e2 = new Employee("Smith", "Expert");
		Employee e3 = new Employee("Walker", "Employee");
		
		emplist.add(e1);emplist.add(e2);emplist.add(e3);
	}
	
	public void assignTask(Employee emp, List<Task> tasks, int priorityChoice){
		if(priorityChoice == 1)
			priorityQueue = new PriorityQueue<>(5, new TaskTimeComparator());
		else if(priorityChoice == 2)
			priorityQueue = new PriorityQueue<>(5, new TaskFeeComparator());
		else
			priorityQueue = new PriorityQueue<>(5, new TaskComparator());
			
		for(Task task : tasks)
			priorityQueue.add(task);
		emp.assignWork(priorityQueue);
	}
	
	public void displayEmpList(){
		int i=1;
		Iterator<Employee> empIterator = emplist.iterator();
		while(empIterator.hasNext()){
			Employee emp = empIterator.next();
			System.out.println(i++ +" "+ emp);
		}
	}
	
	public void displayTaskList(){
		int i=1;
		Iterator<Task> taskIterator = tasklist.iterator();
		while(taskIterator.hasNext()){
			Task task = taskIterator.next();
			System.out.println(i++ + " " +task);
		}
	}
}
