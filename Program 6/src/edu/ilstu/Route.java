/*
 *File name: Route.java
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
public class Route
{
	private String routeNumber;
	private String routeDate; 
	private String departureTrack; 
	private String arrivalTrack;
	private String departureTime;
	private String arrivalTime;
	private String seatAssignment;
	
	public Route() {
		
	}
	
	public Route(String routeNumber,String routeDate,String departureTrack,String arrivalTrack,String departureTime,String arrivalTime,String seatAssignment) {
		this.routeNumber = routeNumber;
		this.routeDate = DateFormatter.formatToWord(routeDate);
		this.departureTrack = departureTrack;
		this.arrivalTrack = arrivalTrack;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.seatAssignment = seatAssignment;
		
	}

	public String getRouteNumber()
	{
		return routeNumber;
	}

	public String getRouteDate()
	{
		
		return routeDate;
	}


	public String getDepartureTrack()
	{
		return departureTrack;
	}

	public String getArrivalTrack()
	{
		return arrivalTrack;
	}


	public String getDepartureTime()
	{
		return departureTime;
	}

	public String getArrivalTime()
	{
		return arrivalTime;
	}


	public String getSeatAssignment()
	{
		return seatAssignment;
	}


	public boolean equalsTo(String inputRouteNumber, String inputRouteDate) {
		if (routeNumber==inputRouteNumber&&routeDate==inputRouteDate) {
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {

		return "Route Number Route Date  Departure Track  Arrival Track  Departure Time Arrival Time\r\n\tSeat\r\n"+routeNumber+"\t "+routeDate+" "+departureTrack+" \t\t"+arrivalTrack+"\t\t "+departureTime+"\t "+ arrivalTime+"\t "+seatAssignment+"\r\n";
	}

}
