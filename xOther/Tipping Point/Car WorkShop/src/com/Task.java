package com;

public class Task {
	private String name;
	private double fee;
	private int timeTaken;

	public Task(String name, double fee, int timeTaken) {
		super();
		this.name = name;
		this.fee = fee;
		this.timeTaken = timeTaken;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getTimeTaken() {
		return timeTaken;
	}

	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
	
	public String toString(){
		return  name+" will take "+timeTaken+" hours and give $"+fee;
	}
}

