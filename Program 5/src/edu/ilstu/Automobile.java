/*
 *File name: Automobile.java
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

/*
 *<insert description>
 *
 * @author Derek
 *
 */
public class Automobile
{
	private int year,rating;
	private double price;
	private String make,model,condition,status,vin;
	private Customer customer;
	
	public Automobile(int year,String make,String model,double price,String condition,int rating,String status,String vin ) {
		this.year=year;
		this.make=make;
		this.model=model;
		this.price=price;
		this.condition=condition;
		this.rating=rating;
		this.status=status;
		this.vin=vin;	
	}
	
	public Automobile(int year,String make,String model,double price,String condition,int rating,String status,String vin ,Customer customer) {
		
		this(year,make,model,price,condition,rating,status,vin);
		this.customer=customer;
	}
	
	public int getYear() {
		return year;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public String getStatus() {
		return status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public int getRating()
	{
		return rating;
	}
	public double getPrice()
	{
		return price;
	}
	
	public String getCondition()
	{
		return condition;
	}
	
	public String getVin()
	{
		return vin;
	}
	
	public String toString() {
		return String.format("%-6s"+"%-15s"+"%-13s"+"%12.2f"+" %-9s"+"%8s "+"%-13s"+"%10s",year,make,model,price,condition,rating,status,vin);
				
	}
	
	
	
	
	
	
	
}
