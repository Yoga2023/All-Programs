package com.citizen;

public class child {
	public child() {
		System.out.println("I am citizen of Inida");
	}

	public child(String name) {

		System.out.println(name);
	}

	public child(String name, char initial, String name1) {

		System.out.println(name + initial + name1);
	}

	public child(long number) {

		System.out.println("Mob No:" + number);
	}

	public child(short year, String month) {

		System.out.println(year + month);
	}

	public static void main(String[] args) {
		child c = new child();
		child cc = new child("yoga" + 'K' + "babu");
		child chi = new child(1996256l);
		child chil = new child(1996 + "Aug");

	}
}
