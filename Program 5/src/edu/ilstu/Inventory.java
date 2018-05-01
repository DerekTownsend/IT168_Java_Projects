/*
 *  File name:  Inventory.java
 *
 *  Programmer:  Kevin Schaefer
 *  ULID:  keschae
 *
 *  Date:  October 24, 2017
 *
 *  Class:  IT 168
 *  Lecture Section:  13
 *  Lecture Instructor:  Schaefer
 *  Lab Section:
 *  Lab Instructor:
 */
package edu.ilstu;

/**
 * Represents an inventory of automobiles and related methods
 *
 * @author Schaefer
 *
 */
public class Inventory
{
	private final static int ARRAY_SIZE = 100;
	private Automobile[] inventory;
	private int size,counter;
	
	/**
	 * Constructor - creates the inventory array
	 */
	public Inventory()
	{
		inventory = new Automobile[ARRAY_SIZE];
	}
	
	public void displayEntireInventory() {
		counter=0;
		System.out.printf("\n%-6s"+"%-15s"+"%-13s"+"%12s"+" %-9s"+"%8s "+"%-13s"+"%10s\n","Year","Make","Model","Price","Condition","Rating","Status","Vin");
		while(counter<size) {
			System.out.println(inventory[counter]);
			counter++;
		}
	}		
	public void sortYear()
    {
		Automobile temp;
		int max;
        
		for (int i = 0; i < size; i++) {
		max = indexOfLargestElement(inventory,size-i);
		
		temp=inventory[max];
		inventory[max]=inventory[size-i-1];
		inventory[size-i-1]=temp;
		}
    }
	private int indexOfLargestElement(Automobile[] inventory,int size)
	{
		int index=0;
		for(int i =1;i<size;i++) {
			if(inventory[i].getYear()>inventory[index].getYear()) {
				index=i;
			}
		}
		return index;
	}

	public void displayAvailableInventory() {
		System.out.printf("\n%-6s"+"%-15s"+"%-13s"+"%12s"+" %-9s"+"%8s "+"%-13s"+"%10s\n","Year","Make","Model","Price","Condition","Rating","Status","Vin");
		counter=0;
		while(counter<size) {
		if(inventory[counter].getStatus().equals("Available")) {
				System.out.println(inventory[counter]);		
			}
		counter++;
		}
	}
	public void displaySoldInventory(){
		counter=0;
		System.out.println("\nRecently Sold Automobiles");
		while(counter<size) {
		if(inventory[counter].getStatus().equals("Sold")) {
				System.out.println(inventory[counter].getYear()+" "+inventory[counter].getMake()+" "+inventory[counter].getModel());		
			}
		counter++;
		}
	}
	
	public void displayBuyersMailList(){
		counter=0;
		while(counter<size-1) {
			if(!inventory[counter].getCustomer().getFirstName().equals(inventory[counter+1].getCustomer().getFirstName())) {
			System.out.println(inventory[counter].getCustomer());
			}		
			counter++;
		}
	}
	
	public void findExactVehicle(String vin){
		counter=0;
		boolean flag=true;
		while(counter<size) {
			if(inventory[counter].getVin().equals(vin)) {
					System.out.println("\n"+inventory[counter]);
					flag=false;
				}
			counter++;
			}
		while(flag) {
			System.out.println("We found no matching vin");	
			flag=false;
		}
			
	}
	
	public Automobile[] getInventory() {
		return inventory;
	}
	public void setTable(Automobile[] Automobile){
		counter=0;
		while(counter<=inventory.length) {
			inventory[counter]=Automobile[counter];
			counter++;
		}
	}
	public int getCount() {
		return size;
	}
	public void setCount(int size) {
		this.size=size;
	}
}