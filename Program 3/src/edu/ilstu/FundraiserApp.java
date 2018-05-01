/*
w *File name: FundraiserApp.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Oct 10, 2017
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
public class FundraiserApp
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Fundraiser school1=new Fundraiser();
		
		System.out.println("\tWelcome to the Pastry and Cookies Products\n");
		System.out.printf("\nPastry\n\n"+"Cinnamon \t$%,.2f",school1.getPASTRY());
		System.out.printf("\nCheese \t\t$%,.2f",school1.getPASTRY());
		System.out.printf("\nStrawberry \t$%,.2f",school1.getPASTRY());
		
		System.out.printf("\n\nCookie Dough\n\n"+"Chocolate Chip \t$%,.2f",school1.getCOOKIE_DOUGH());
		System.out.printf("\nPeanut Butter \t$%,.2f\n",school1.getCOOKIE_DOUGH());
		
		//Get user input
		System.out.print("\nEnter number of Cinnamon pastry: "); 
		school1.setCinnamon(scan.nextInt());
		System.out.print("Enter number of Cheese pastry: ");
		school1.setCheese(scan.nextInt());
		System.out.print("Enter number of Strawberry pastry: ");  
		school1.setStrawberry(scan.nextInt());
		System.out.print("Enter number of Chocolate Chip cookie dough: ");  
		school1.setChocolateChip(scan.nextInt());
		System.out.print("Enter number of Peanut Butter cookie dough: ");
		school1.setPeanutButter(scan.nextInt());
		
		//Display orders
		System.out.println("\n\nOrder Summary\n\n"+"\tOrder Counts");
		System.out.println("Cinnamon \t\t"+school1.getCinnamon());
		System.out.print("Cheese \t\t\t"+school1.getCheese());
		System.out.print("\nStrawberry \t\t"+school1.getStrawberry());
		System.out.print("\nChocolate Chip \t\t"+school1.getChocolateChip());
		System.out.print("\nPeanut Butter \t\t"+school1.getPeanutButter());
		
		//Display totals
		System.out.printf("\n\nTotal order cost: $%,.2f\n" + "School share: $%,.2f\n" + "Net Cost to be paid: $%,.2f",school1.calculatePastryCost()+school1.calculateCookieCost(),school1.calculateSchoolShare(),school1.calculateNetCost());

		scan.close();
	}

}
