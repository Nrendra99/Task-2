package com.human;

public class Employee  extends Person  {  //creating class Employee that inherits from Person class 

	String employeeid; //creating instance variable for employeeid 
	double salary;     //creating instance variable for salary
	String role;       //creating instance variable for role
	 	   
	 	   public Employee (String employeeid, double salary, String role, int age,String name) { //parameterized constructor with attributes to initialize object Employee
	 		   super(name,age);                                                                   //super keyword inheriting methods from class 
	 		   this.employeeid=employeeid;
	 		   this.salary=salary;
	 		   this.role=role;
	 	
	 	   }
		
		public String getEmployeeid() {  //getters and setters methods for each variable 
			return employeeid;
		}



		public void setEmployeeid(String employeeid) {
			this.employeeid = employeeid;
		}



		public double getSalary() {
			return salary;
		}



		public void setSalary(double salary) {
			this.salary = salary;
		}



		public String getRole() {
			return role;
		}



		public void setRole(String role) {
			this.role = role;
		}



		public void dispalayEmplyeeDetails() { //method to print attributes of Employee
			display();
			System.out.println("Employee ID: " + employeeid);
	        System.out.println("Salary: " + salary);
	        System.out.println("Role: " + role);
		}
		public static void main(String[]args) {
			
			 Employee employee1=new Employee("100A", 50000, "Developer", 25, "Narendra Kumar");	//creating object employee1 with values for each attribute		
			          employee1.dispalayEmplyeeDetails();
		}
}
