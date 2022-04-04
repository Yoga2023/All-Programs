package com.citizen;

public class Citizen {

	public Citizen() {

		this("personal details:");
		System.out.println("I am citizen of Inida");
	}

	public Citizen(String name) {
		this("Name As Per Aadhar :", 'k', "YOGANANDHABABU");
		System.out.println(name);
	}

	public Citizen(String name, char initial, String name1) {
		this(44248251l);
		System.out.println(name + initial + "  " + name1);
	}

	public Citizen(long number) { 
		//this(1996, "AUG");
		System.out.println("Mob No:" + number);
	}

	
	  public Citizen(int year, String month) {
	  // if i give short here it showing error
	  System.out.println("year:"+year + month);
	  }
	 

	public static void main(String[] args) {
		Citizen c = new Citizen();
		 Citizen d = new Citizen(1996 + "Aug");
		
	}
}
