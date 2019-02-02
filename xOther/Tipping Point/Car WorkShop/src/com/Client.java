package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	static Scheduler scheduler = new Scheduler();

	public static void main(String[] args) {

		scheduler.initializer();

		int taskNo ,empNo, priorityCh ;
		String cont= "n", choice = "n";
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Below is the list of task: ");
			scheduler.displayTaskList();

			System.out.println("\n\nBelow is the list of Employee: ");
			scheduler.displayEmpList();
			List<Integer> tlist = new ArrayList<Integer>();
			do {
				System.out.println("Please enter emp no. to assigntask");
				empNo = scan.nextInt();
				if( empNo < 1 || empNo > scheduler.emplist.size()){
					System.out.println("You have selected the wrong number...");						
				}			
			} while (empNo < 1 || empNo > scheduler.emplist.size());

			do{				
				do {
					System.out.println("Please enter task no. to assigntask: ");
					taskNo = scan.nextInt();
					if(taskNo < 1 || taskNo > scheduler.tasklist.size() ){
						System.out.println("You have selected the wrong number...");						
					}			
				} while (taskNo < 1 || taskNo > scheduler.tasklist.size());

				tlist.add(taskNo);
				System.out.println("Do you want to assign more task to Employee "+ empNo +" ?(y/n)");
				choice = scan.next();
			}while(choice.equalsIgnoreCase("y"));
			
			System.out.println("Please enter priority choice:\n 1. Time taking task\t 2. Service Fee task\t 3. Any for default");			
			priorityCh = scan.nextInt();
			if(!(priorityCh==1 || priorityCh == 2))
				priorityCh = 0;
			assignment(empNo, tlist, priorityCh);
			System.out.println("Do you want to continue?(y/n)");
			cont = scan.next();
		}while(cont.equalsIgnoreCase("y"));
		scan.close();
		ExecutorClass.execute(scheduler.emplist);
	}

	public static void assignment(int e, List<Integer> t, int priorityChoice){
		Employee emp = scheduler.emplist.get(e-1);
		List<Task> tasks = new ArrayList<Task>();

		for(Integer i: t){
			Task task = scheduler.tasklist.get(i-1);
			tasks.add(task);
		}		
		scheduler.assignTask(emp, tasks, priorityChoice);
	}
}

