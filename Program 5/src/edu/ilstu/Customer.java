/*
 *File name: Customer.java
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
public class Customer
{
	private String firstName,lastName,address,city,state,zip,email,phone;
	
	public Customer(String firstName,String lastName,String address,String city,String state,String zip,String email,String phone){
		this.firstName = firstName;
		this.address = address;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		this.phone = phone;
	}

	public String getPhone()
	{
		return phone;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getAddress()
	{
		return address;
	}
	public String getLastName()
	{
		return lastName;
	}

	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getZip()
	{
		return zip;
	}

	public String getEmail()
	{
		return email;
	}
	public String toString()
	{
		return "\nName: "+firstName +" "+ lastName+"\nAddress: "+ address+"\nCity/State/Zip: "+ city+", "+ state+" "+ zip+"\nEmail: "+ email+"\nPhone: "+String.format("(%s) %s-%s", phone.substring(0, 3), phone.substring(3, 6), phone.substring(6, 10)) ;
	}
}
