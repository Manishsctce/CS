package com;

public class TaskFeeComparator extends TaskComparator{

	public int compare(Task t1, Task t2) {
		if(t1.getFee() < t2.getFee())
			return 1;
		else if(t1.getFee() > t2.getFee())
			return -1;
		else
			return 0;
	}
}