package com.techelevator.dog;

public class Dog {
	private boolean sleeping;
	
	public String makeSound(){
		if (sleeping){
			return "Zzzzz...";
		} return "Woof!";
	}
	
	public void sleep(){
		this.sleeping = true;
	}
	
	public void wakeUp(){
		this.sleeping = false;
	}

	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = !sleeping;
	}

}
