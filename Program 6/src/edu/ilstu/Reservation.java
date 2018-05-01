/*
 *File name: Reservation.java
 *
 *Programmer: Derek Townsend
 *ULID: djtown1
 *
 *Date: Nov 28, 2017
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
public class Reservation
{
	private String name;
	private String reservationNumber; 
	private Route departureRoute; 
	private Route returnRoute;
	
	public Reservation() {
		
	}
		
	public Reservation(String name,String reservationNumber,Route departureRoute,Route returnRoute) {
		this.name = name;
		this.reservationNumber = reservationNumber;
		this.departureRoute = departureRoute;
		this.returnRoute=returnRoute;
	}	

	public String getName()
	{
		return name;
	}

	public String getReservationNumber()
	{
		return reservationNumber;
	}

	public Route getDepartureRoute()
	{
		return departureRoute;
	}
	public Route getReturnRoute()
	{
		return returnRoute;
	}
	
	public boolean equalsTo(String searchReservation) {
		if(searchReservation.equals(reservationNumber)) {
			return true;
		}else {
			return false;
		}
		
	}
	public String toString() {
		return "Passenger Name\tReservation Number\r\n"+name+" "+reservationNumber+"\r\nDeparture Route\r\n"+departureRoute +"\r\nReturn Route\r\n"+ returnRoute;
	}
	
	
	
	
}
