package com;
import java.util.Comparator;

public class TaskComparator implements Comparator<Task>{
	@Override
	public int compare(Task t1, Task t2) {
		if(t1.getTimeTaken() > t2.getTimeTaken())
			return 1;
		else if(t1.getTimeTaken() < t2.getTimeTaken())
			return -1;
		else
			return 0;
	}
}
