package Vehicle;

import java.util.Scanner;

public class Car
    {
	
	public void Color()
	{
	
		String myCar="Green";
		
		System.out.println("The initial color of my Car is "+myCar);
    
    }
	
	public void CustomizeColor()
	{
	String customize;
	Scanner key=new Scanner(System.in);
	customize=key.next();
	System.out.println("The new color of my Car is "+customize+"!!!");
	
	
	}
	
}


