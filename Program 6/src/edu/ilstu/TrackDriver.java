/*
 *File name: TrackDriver.java
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
public class TrackDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{		
		TrackInput input=new TrackInput();
		input.reservations();
		Track track=new Track();
		track.transactions(input.getCount());

		
	}

}
