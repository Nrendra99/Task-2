package com.human;

public class Person {
	 int age =18; //creating instance variable for age with default value
	 String name; //creating instance variable for name
	
	public Person() {  //default constructor since we have another parameterized constructor 
		
	}
	public Person (String name, int age) { //Parameterized constructor with attributes to initialize object Person 
		
	 this.name=name; 
	 this.age=age;		
	}
	
	public int getAge() {          //getters and setters method for each instance variable
		return age;
	}
	public void setAge(int age) {  
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display () {       //method to print the attributes of Person
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	
	
	public static void main(String[]args) {  
		
		Person person1=new Person(); //creating object person1 with values for each attribute	
			person1.setName("Narendra Kumar");//setting custom name only 
			person1.display();
					
	    }
		
	}

