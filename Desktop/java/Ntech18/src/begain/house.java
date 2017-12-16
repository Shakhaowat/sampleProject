/*Shakhaowat Bhuiyan
This project is mainly focus on passing the default method
and passing a parameter with a return value
as well as how to take the input from user.
*/
package begain;

import java.util.Scanner;

public class house {
	
	
	
	int houseNumber;// declare the variable as integer;
	String housename="Whitehouse";//declare the variable as string;
	
	public void showHname()
	{
     System.out.println("I live in "+housename);
	}
	
	
	public void NewHouse()
	{
		System.out.println("I recently moved from White house");
		
		String Nhouse;
		System.out.println("What is your new House?");
		
		Scanner input=new Scanner(System.in);// To get the string input from user.
		Nhouse=input.next();
		
		System.out.println("My new House is "+Nhouse);
		
	}
	
	
	
	

}
