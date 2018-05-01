/*
 *File name: AutoDriver.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Nov 15, 2017
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
public class AutoDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		InputOutput inputOutput=new InputOutput();
		Inventory inventory=new Inventory();
		inventory.setCount(inputOutput.readInventory(inventory.getInventory()));
		
		String input;
		boolean flag=true;
		while(flag) {
			inputOutput.displayMenuGetChoice();
			input=keyboard.nextLine();
			if(input.equals("1")) {
				inventory.displayEntireInventory();
			}else if(input.equals("2")) {
				inventory.sortYear();
				inventory.displayEntireInventory();
			}else if(input.equals("3")) {
				inventory.displayAvailableInventory();
			}else if(input.equals("4")) {
				inventory.displaySoldInventory();
			}else if(input.equals("5")) {
				inventory.displayBuyersMailList();
			}else if(input.equals("6")) {
				System.out.print("Find exact automobile by VIN number\n" + 
					"Please enter the VIN number: ");
				String vin=keyboard.nextLine();
				System.out.print("We have found this vehicle:");
				inventory.findExactVehicle(vin);
			}else if(input.equals("7")) {
				flag=false;
				System.out.println("\nQuiting Application");
			}else {
				System.out.println("Invalid choice try again");
			}
		}
		keyboard.close();
	}

}
