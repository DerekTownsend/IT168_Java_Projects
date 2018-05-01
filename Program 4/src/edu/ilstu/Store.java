/*
 *File name: Store.java
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
;
/*
 *This class will keep track of the store location. 
 *
 * @author Derek
 *
 */
public class Store
{
	private String location;
	
	public void pickingLocation(String locationNumber) {
		
		if (locationNumber.equals("1")) {
			location="207 W North St, Normal IL";
		}else if(locationNumber.equals("2")) {
			location="305 S Main St, Normal IL";
		}else if(locationNumber.equals("3")) {
			location="208 Landmark , Bloomington IL ";
		}else {
			location="";
		}
			
	}
	
	public String getLocation() {
		return location;
	}
	
	public String toString() {
		return location;
	}

}
