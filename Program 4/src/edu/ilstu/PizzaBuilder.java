/*
 *File name: PizzaBuilder.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Oct 26, 2017
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
public class PizzaBuilder
{
	
	private String sauce,cheese,currentToppings="";
	private int  numOfToppings;
	Scanner keyboard =new Scanner(System.in);
	public String chooseSauce() {
		
		return "\nSecond, lets build your pizza\r\n" + 
				"Pick a source by typing the sauce:\n" + 
				"List of sauces: "+
					 "\n\t\tSalsa"+
					 "\n\t\tBBQ	"+
					 "\n\t\tTapenade"+
					 "\n\t\tPesto	"+
					 "\n\t\tBechamel \n" + 
					 "Answer:  ";
	}
	public String chooseTopping() {
		String topping="";
		boolean flag=true;	
		while(flag==true) {
			System.out.print("Pick Topping from the list above  ");
		
			int choice=keyboard.nextInt();		
		
			switch (choice) {
			case 1:
				topping="Onion";
				break;
			case 2:
				topping="Olives";
				break;
			case 3:
				topping="Tomato";
				break;
			case 4:
				topping="Mushrooms";
				break;
			case 5:
				topping="Green Peppers";
				break;
			case 6:
				topping="Pepperoni";
				break;			
			}
			if(currentToppings.contains(topping)) {
				System.out.println("You already have this topping please Select new topping");
				flag=true;
			}else {
			currentToppings+=" "+topping;
			
			flag=false;
			}
			
		}
		
		return currentToppings;
		}
		

		
	
	
	public void	chooseCheese() {
		
	}
	public String determineTopping() {
		return currentToppings;
		
	}
	public void setSauce(String sauce) {
		boolean sauceflag=true;
		while(sauceflag==true) {
			if(sauce.equalsIgnoreCase("Salsa")) {
				this.sauce="Salsa";
				sauceflag=false;
			}else if(sauce.equalsIgnoreCase("BBQ")) {
				this.sauce="BBQ";
				sauceflag=false;
			}else if(sauce.equalsIgnoreCase("Tapenade")) {
				this.sauce="Tapenade";
				sauceflag=false;
			}else if(sauce.equalsIgnoreCase("Pesto")) {
				this.sauce="Pesto";
				sauceflag=false;
			}else if(sauce.equalsIgnoreCase("Bechamel")) {
				this.sauce="Bechamel";
				sauceflag=false;
			}else{
				System.out.println("This is not a valid response please enter a new one");
				sauce=keyboard.next();
				sauceflag=true;
			}
		}
	}
	
	
	public void setCheese(String cheese) {
		boolean cheeseflag=true;
		while(cheeseflag==true) {
			if(cheese.equalsIgnoreCase("Y")) {
				this.cheese="extra cheese";
				cheeseflag=false;
			}else if(cheese.equalsIgnoreCase("N")){
				this.cheese="normal cheese";
				cheeseflag=false;
			}else {
				System.out.println("This is not a valid response please enter a new one");
				cheese=keyboard.next();
				cheeseflag=true;
			}
		}
	}
	
	public void setNumOfToppings(int numOfToppings) {
		this.numOfToppings=numOfToppings;
	}
	
	public String getSauce() {
		return sauce;
	}
	
	public String getCheese() {
		return cheese;

	}
	public int getNumOfToppings() {
		return numOfToppings;

	}

}
