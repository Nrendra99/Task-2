package com.shop;

import java.util.Scanner;

public class XYZ {
	
	
	Product [] products=new Product[5];  //Creating array to store the products
	
		public void inputProductValues(){ //method to get input from user 
			
			Scanner scanner=new Scanner(System.in);   //scanner object to take input from user 
			for(int i=0;i<5;i++) {                    //for loop to print input prompt for as many products
				System.out.println("Enter Product ID;"); 
				String pid= scanner.nextLine();       //read Product ID
				
				System.out.println("Enter Price:");
				double price= scanner.nextDouble();   //read Price
				
				System.out.println("Enter Quantity;");
				int quantity= scanner.nextInt();      //read Quantity 
				
				scanner.nextLine();                   //prints next line correctly 
				
				products[i] =new Product(pid, price ,quantity);  //Create new product and stores in array 
			  }
			scanner.close();                          // close the scanner 
	     }
		
		 public String highestPricedPid() { //method to find highest priced Product ID
			 
			Product highestPricedProduct=products[0]; //initialize with the first product
			
			for(int i=0;i<products.length;i++) { //for loop to check all products
				
				if (products[i].getPrice()>highestPricedProduct.getPrice()) //logic to check which product id is the highest 
					highestPricedProduct=products[i]; //updating highest priced product
			}
				return highestPricedProduct.pid;  //returning the Product ID 
		 }

		
		public double Totalamount() {  //method to find total amount spent on all products
			
			double totalAmount=0;      //initialize total amount 
			
			for(int i=0;i<products.length;i++) {  //logic to get total amount 
				totalAmount+=products[i].getQuantity()*products[i].getPrice();
			}
			    return totalAmount;    // returning total amount
		}
		public static void main(String[]args) { 
			XYZ xyz= new XYZ();        //creating object XYZ to store all methods 
			xyz.inputProductValues();  //Implementing method to get input
			String highestPriceProduct =xyz.highestPricedPid(); //creating a variable and storing return value of highestPricedPid method
	        double totalAmount = xyz.Totalamount(); //creating a variable and storing return value of totalAmount method

	        System.out.println("Prduct ID of the product with the highest price: " + highestPriceProduct); //printing the variables with the answer 
	        System.out.println("Total amount spent on all products: " + totalAmount);                      //printing the variables with the answer 
		}
}
