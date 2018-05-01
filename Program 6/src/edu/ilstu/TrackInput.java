/*
 *File name: TrackInput.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 *<insert description>
 *
 * @author Derek
 *
 */
public class TrackInput
{
	private int count=0;
	Reservation[] reservations=new Reservation[40];
	Reservation reservation=null;

	public TrackInput() {
		
	}
	
	public Reservation[] reservations() {
		String name;
		String reservationNumber;  
		String routeNumber;
		String routeDate; 
		String departureTrack; 
		String arrivalTrack;
		String departureTime;
		String arrivalTime;
		String seatAssignment;
		
		File fileObject=new File("TrackData.txt");
		Scanner read=null;
		try
		{
			read = new Scanner(fileObject);
		}catch (FileNotFoundException e)
		{
		// TODO Auto-generated catch block
		System.out.println("File Not Found");
		}
		String line=null;
		while(!(line=read.nextLine()).isEmpty()){ 
			name=line;
			reservationNumber=read.nextLine();
			routeNumber=read.nextLine();
			routeDate=read.nextLine();
			departureTrack=read.nextLine();
			arrivalTrack=read.nextLine();
			departureTime=read.nextLine();
			arrivalTime=read.nextLine();
			seatAssignment=read.nextLine();
			Route departing=new Route(routeNumber,routeDate,departureTrack,arrivalTrack,departureTime,arrivalTime,seatAssignment);
			routeNumber=read.nextLine();
			routeDate=read.nextLine();
			departureTrack=read.nextLine();
			arrivalTrack=read.nextLine();
			departureTime=read.nextLine();
			arrivalTime=read.nextLine();
			seatAssignment=read.nextLine();
			Route returning=new Route(routeNumber,routeDate,departureTrack,arrivalTrack,departureTime,arrivalTime,seatAssignment);
			reservation=new Reservation(name,reservationNumber,departing,returning);
			reservations[count]=reservation;
			count++;

		}
		return reservations;

	}
	public int getCount() {
		return count;
	}

}
