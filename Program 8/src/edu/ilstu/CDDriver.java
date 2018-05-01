/*
 * File name: CDDriver.java
 * 
 * Programmer: 
 * ULID:
 *
 * Date:  
 *
 * Class: 
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */
package edu.ilstu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author 
 *
 */
public class CDDriver 
{

	public static void main(String[] args) throws IOException 
	{
		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";
		
		int	count = 0;  // Counter to keep track of number of elements in the array
		int choice = 0; // Menu choice
		Song song=new Song(null,null);
		// Create array to hold song collection
		Song[] collection=new Song[MAX_ARRAY_SIZE];
		
		
		// Read the data from the input file into the array
		// Count the elements currently in the array 
		File fileObject=new File(FILENAME);
		Scanner read = new Scanner(fileObject);
		while(read.hasNextLine()){
			song=new Song(read.nextLine(),read.nextLine());
			collection[count]=song;
			count++;
		}
		read.close();
		
		
		// Open the file for reading
		
		
		
		// Display the menu
		for(int i=0;i<count;i++){
			System.out.println(collection[i]);
		}
		
		// Read the menu choice
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nPlease Choose:"
				+ "\n1.Add another song to in collection"
				+ "\n2.Display Current songs in collection");
		choice=keyboard.nextInt();
		while (choice != 3)
		{
			switch (choice)
			{
				case 1:
					// Read data for new song to add to the collection from the keyboard
					keyboard.nextLine();
					System.out.print("Please enter song title: ");
					String title=keyboard.nextLine();
					System.out.print("Please enter song artist: ");
					String artist=keyboard.nextLine();
					
					song=new Song(title,artist);
					// Add the song to the array 
					collection[count]=song;
					
					// Don't forget to increment the count
					count++;
					
					// Add the song to the file
					try
					{
						FileOutputStream fos = new FileOutputStream(FILENAME,true);
						PrintWriter pw = new PrintWriter(fos);
						
						pw.println(title);
						pw.println(artist);
						pw.close();
						
					}
					catch (FileNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					// Print the list
					for(int i=0;i<count;i++){
						System.out.println(collection[i]);
					}
					
					break;
				default:
					System.out.println("Invalid menu choice.  Please try again.");
			}
			
			
			// Print the menu
			System.out.println("\nPlease Choose:"
					+ "\n1.Add another song to in collection"
					+ "\n2.Display Current songs in collection");
			
			// Read the menu choice
			choice=keyboard.nextInt();
			
		}
		
		// Close the output file
		keyboard.close();
		
	}

}
