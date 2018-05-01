/*
 *File name: Track.java
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
public class Track
{
	Reservation[] reservationList=new Reservation[40];	
	TrackInput input=new TrackInput();
	TrackOutput print=new TrackOutput();
	Reservation reservation=null;

	public Reservation[] reservationList(){
		reservationList=input.reservations();
		return reservationList;
		
	}

	
	public void transactions(int count) {
		reservationList=reservationList();
		String fileName="Transactions.txt";
		File fileObject=new File(fileName);
		Scanner read=null;
		int code;
		String name;
		String reservationNumber;  
		String routeNumber;
		String routeDate; 
		String departureTrack; 
		String arrivalTrack;
		String departureTime;
		String arrivalTime;
		String seatAssignment;
		try
		{
			read = new Scanner(fileObject);
		}catch (FileNotFoundException e)
		{
		// TODO Auto-generated catch block
		System.out.println("File Not Found");
		}
		while(read.hasNextLine()) {
			code=Integer.parseInt(read.nextLine());
			if(code==1) {	
				name=read.nextLine();
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
				reservationList[count]=reservation;
				count++;
			
			}else if(code==2) {
				String resNumber=read.nextLine();
				for(int i=0;i<count;i++) {		
					if(reservationList[i].getReservationNumber().equals(resNumber)) {
						print.printPassenger(reservationList[i]);
						break;

					}
				}
			}else if(code==3) {
				print.printAllPassengers(reservationList, count);
			}else if(code==4) {
				print.printToFile(reservationList, count);
			}
		
		}
		read.close();
	}
	

}
