/*
 *File name: Project02.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Sep 13, 2017
 *
 *Class: IT 168
 *Lecture Section: 004
 *Lecture Instructor:Dr Xing Fang
 *Lab Section: 005
 *Lab Instructor: Simran Kaur
 */
package edu.ilstu;
/*
 * The program that is needed for the online ordering system will allow the customer to order as many of each type of food items as they wish.  
 *
 * @author Derek Townsend
 *
 */
import java.util.Scanner;

public class Project02
{
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		final double SALES_TAX=0.08, DELIVERY_CHARGE=0.05, FRIES=1.99, BURGER=4.19, SODA=1.89, ICE_CREAM=2.29;
		double subTotal,tax,delivery,totalBill;
		int userFries,userBurger,userSoda,userIceCream;
		
		System.out.printf("%23s\n\n"+"Fries%30s\n"+"Burger%29s\n"+"Soda%31s\n"+"Ice cream%26s\n\n","Food Menu","$"+FRIES,"$"+BURGER,"$"+SODA,"$"+ICE_CREAM );
		
		System.out.print("\nEnter number of fries:  ");
		userFries= scan.nextInt();
		System.out.print("Enter number of burgers:  ");
		userBurger= scan.nextInt();
		System.out.print("Enter number of soda:  ");
		userSoda= scan.nextInt();
		System.out.print("Enter number of ice cream:  ");
		userIceCream=scan.nextInt();
		
		System.out.printf("\n\n%25s\n"+
		"\n%43s\n"+
		"Fries%30s\n"+
		"Burger%29s\n"+
		"Soda%31s\n"+
		"Ice cream%26s\n"
		,"Order Summary","Food Items Ordered",
		userFries,userBurger,userSoda,userIceCream);
	
		subTotal=(FRIES*userFries)+(BURGER*userBurger)+(SODA*userSoda)+(ICE_CREAM*userIceCream);
		tax=subTotal*SALES_TAX;
		delivery=subTotal*DELIVERY_CHARGE;
		totalBill=subTotal+tax+delivery;
		
		
		System.out.printf("\nSub-total:\t\t$ %.2f\n"+
		"Tax:\t\t\t$  %.2f\n"+
		"Delivery:\t\t$  %.2f\n"+
		"Total Bill:\t\t$ %.2f\n"
		,subTotal,tax,delivery,totalBill);
	}

}
