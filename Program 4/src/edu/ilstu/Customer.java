/*
 *File name: Customer.java
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

/*
 *Keeps track of the customer name, address, and phone number.
 *
 * @author Derek
 *
 */
public class Customer
{
	private String fullName,address,phoneNumber;
	
	public void readInformation(String fullName,String address,String phoneNumber){
		this.fullName=fullName;
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	
	public String getFullName() {
		return fullName;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String toString() {
		return fullName+" "+address+" "+phoneNumber;
	}
}
