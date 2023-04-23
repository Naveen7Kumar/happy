package com.wipro;

public class Const {

	public Const() {
		this("Naveen");
		System.out.println("Default constructor");
	}

	public Const(String name) {
		this(10);
		System.out.println("Name : "+name);

	}

	public Const(int ID) {
		System.out.println("My Id : " + ID);
	}

	public static void main(String[] args) {
		Const c = new Const();

	}
}
