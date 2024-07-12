package com.masai1;

public class Person {
	
	
	public String name;
	public int age;
	public static void main(String[] args) {
		Person P = new Person("Sejal", 20);
		P.displaydetail();
	}
	public Person(String name, int age) {
		this.name = name;
	  this.age = age;
	  

	
	}
public void displaydetail() {
	System.out.println(name );
	System.out.println(age);
}
}
