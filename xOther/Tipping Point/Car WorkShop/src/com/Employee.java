package com;

import java.util.PriorityQueue;


public class Employee implements Runnable { 
	private String empName;
	private String designation;
	PriorityQueue<Task> pq;

	public Employee(String empName, String designation) {
		this.empName = empName;
		this.designation = designation;
	}

	public void run(){
		Task t ;
		while( (t = pq.poll() ) != null){
			try {
				System.out.println(empName +" is doing "+ t.getName()+ " at this time\n");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Exception while running emptask "+e.getMessage());				
			}
			finally{
				System.out.println(empName+" did "+t.getName()+" for "+t.getTimeTaken()+" hr and make $"+t.getFee());
			}
		}
	}
	public void assignWork(PriorityQueue<Task> pq){
		this.pq = pq;
	}

	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}	

	public String toString(){
		//return "Name: "+empName+" Designation: "+designation;
		return empName+" : "+designation;
	}
}
