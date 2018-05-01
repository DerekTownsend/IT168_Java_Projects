/*
 *File name: PizzaDriver.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Oct 27, 2017
 *
 *Class: IT 168
 *Lecture Section: 004
 *Lecture Instructor:Dr Xing Fang
 *Lab Section: 005
 *Lab Instructor: Simran Kaur
 */
package edu.ilstu;

import java.util.Scanner;
/*
 *<insert description>
 *
 * @author Derek
 *
 */

public class PizzaDriver
{

	public static void main(String[] args)
	{
		boolean phoneFlag=true, addressFlag=true;
		String userAddress="" ,fullName="" ,phoneNumber="" ,address="" ,deliveryOrder="" , confirmOrder="";
		Scanner keyboard =new Scanner(System.in);		
		Customer customer1=new Customer();
		Store store1=new Store();
		Order order1=new Order();
		PizzaBuilder pizza1= new PizzaBuilder();
		
		
		
		System.out.print("Welcome to ILSTU pizza store, lets cook your Pizza \n" + 
				"First: is this for a pickup or delivery? type 1 for pickup, 2 for delivery\n Answer: ");

		deliveryOrder=keyboard.next();
		order1.setOrderType(deliveryOrder);
		
		if(order1.getOrderType().equals("pickup order")){
			System.out.print("Pick a location that is close to you by typing 1, 2 or 3:\n" + 			
					"\t1-207 W north st, Normal IL\n" + 
					"\t2-305 S main st, Normal IL\n" + 
					"\t3-208 landmark, Bloomington IL\n" + 
					"Answer:  ");	
			 address=keyboard.next();
			
			while(addressFlag==true) {
			 if (address.equals("1")||address.equals("2")||address.equals("3")) {
				 addressFlag=false;
			 }else {
			    	addressFlag=true;
			    	System.out.println("Try again, not a valid location");
			    	address=keyboard.next();
			 }
			 store1.pickingLocation(address);
			}
		}else if(order1.getOrderType().equals("delivery")){
			
			System.out.print("\nPlease enter your full name:  ");
			keyboard.nextLine();
			fullName=keyboard.nextLine();
			System.out.print("Please enter the address:  ");
			userAddress=keyboard.nextLine();
			
			System.out.print("\nPlease provide the phone number starting with the area code:  ");	

			phoneNumber=keyboard.next();
			
			while(phoneFlag==true) {
				if (phoneNumber.length()==10) {
					phoneFlag=false;
				}else if((phoneNumber.length()<10)) {
					phoneFlag=true;
					System.out.println("Too short, try again");
					phoneNumber=keyboard.next();
				}else if(phoneNumber.length()>10) {	
					phoneFlag=true;
					System.out.println("Too long, try again");
					phoneNumber=keyboard.next();
				}
				
			}
			
			
			
		}
		customer1.readInformation(fullName, userAddress, phoneNumber);		

		System.out.print(pizza1.chooseSauce());
		pizza1.setSauce(keyboard.next());

		System.out.print("\nTopping list: \n" + 
				"\t1-onion\n" + 
				"\t2-olives\n" + 
				"\t3-tomato\n" + 
				"\t4-mushrooms\n" + 
				"\t5-green peppers\n" + 
				"\t6-Pepperoni\n"
				);
		
		pizza1.chooseTopping();
		boolean flag2=true;	
		int counter=-1;
		while(flag2==true){
			counter++;		
			System.out.print("Do you want to add another? type yes or no\n");
			String anotherTopping=keyboard.next();
			if(anotherTopping.equalsIgnoreCase("yes")) {
							pizza1.chooseTopping();
													
				}else if(anotherTopping.equalsIgnoreCase("no")){
							flag2=false;
						}
			
			
				}
		pizza1.setNumOfToppings(counter);
		
		
		System.out.println("do you want extra cheese, its Free :)? Type Y for Yes or N for No  ");
		pizza1.setCheese(keyboard.next());
		
		
		if(order1.getOrderType().equals("pickup order")){
		System.out.println("Order Summary: \n" + 
				"______________ \n" + 
				"This is a "+order1.getOrderType() +
				", location of the store to pickup from is "+
				store1.getLocation()+"\n" + 
				" The pizza will have "+ 
				pizza1.getSauce() +
				" sauce, with "+ 
				pizza1.getCheese()+
				", and "+pizza1.determineTopping() +" toppings\n"); 
		order1.summary(pizza1.getNumOfToppings());

		}else if(order1.getOrderType().equals("delivery")){
			System.out.println("Order Summary: \n" + 
					"______________ \n" + 
					"This is a "+order1.getOrderType() +
					" order, deliver to "+
					customer1.getFullName()+"\nAddress: " + 
					customer1.getAddress()+
					"\nPhone number to call in case we got lost \n"+
					customer1.getPhoneNumber()+
					"\n The pizza will have "+ 
					pizza1.getSauce() +
					" sauce, with "+ 
					pizza1.getCheese()+
					", and "+pizza1.determineTopping() +" toppings\n");
			order1.summary(pizza1.getNumOfToppings());

		}

		System.out.println("Do you want to place the order? type y for Yes and n for No");
			confirmOrder=keyboard.next();
			boolean cheeseflag=true;
			while(cheeseflag==true) {
				if(!confirmOrder.equalsIgnoreCase("Y")&&!confirmOrder.equalsIgnoreCase("N")) {
				System.out.println("This is not a valid response please enter a new one");					
				confirmOrder=keyboard.next();
				cheeseflag=true;
				}else if(confirmOrder.equalsIgnoreCase("Y")){
					System.out.println("Your pizza will be ready in 30 min, Thanks for doing business with us.");
					cheeseflag=false;
				}else if(confirmOrder.equalsIgnoreCase("N")){
					System.out.println("Thanks for wasting our time. Please don't visit us again.");
					cheeseflag=false;
				}
			}
		keyboard.close();
	}
	
	

}

