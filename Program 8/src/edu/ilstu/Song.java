/*
 *File name: Song.java
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

/**
 *<insert class description here>
 *
 * @author Derek Townsend
 *
 */
public class Song
{
	private String title;
	private String artist;
	
	public Song(String title,String artist){
		this.title = title;
		this.artist = artist;
	}
	public String toString(){
		return title +" by "+artist ;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		System.out.print("\nPlease enter a song title");
		this.title = title;
	}
	public String getArtist()
	{
		return artist;
	}
	public void setArtist(String artist)
	{
		System.out.print("\nPlease enter the songs artist");
		this.artist = artist;
	}
	

}
