package com.masai;

public class Person {
	//This is My First Java Program
	
			
//		public class Person {
	
	
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
	    this.age = age;
	}
	  

    public void displaydetail() {
    	System.out.println(name);
    	System.out.println(age);
    }
    
	
	public static void main(String[] args) {
		Person P = new Person("Sejal", 20);
		P.displaydetail();
	}
	
  
}



