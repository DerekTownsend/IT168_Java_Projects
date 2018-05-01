/*
 *File name: TrackOutput.java
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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/*
 *<insert description>
 *
 * @author Derek
 *
 */
public class TrackOutput
{
	public void printPassenger(Reservation passenger){
		System.out.println("Transaction 2");
		System.out.println(passenger);
		
	}
	public void printAllPassengers(Reservation[] reservations,int count){
		System.out.println("Transaction 3");
		for(int i=0;i<count;i++) {
			System.out.println(reservations[i]);
		}
	}
	public void printToFile(Reservation[] reservations,int count){
		try
		{
			FileOutputStream fos = new FileOutputStream("DJT-UpdatedData.txt",false);
			PrintWriter pw = new PrintWriter(fos);
			
			for(int i=0;i<count;i++) {
				pw.println(reservations[i]);
			}
			pw.close();
			
		}
		catch (FileNotFoundException e)
		{

			e.printStackTrace();
		}
		
	}

}
