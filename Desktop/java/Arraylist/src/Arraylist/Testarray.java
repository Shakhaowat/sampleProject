package Arraylist;

import java.util.ArrayList;
public class Testarray {

	public static void main(String[] args) {
	
		
	      ArrayList<String> obj=new ArrayList<>();
		  obj.add("Mohammad");
		  obj.add("Harry");
		  obj.add("Chaitanya");
		  obj.add("Steve");
		  obj.add("Anuj");

		  /* Displaying array list elements */
		  System.out.println("Currently the array list has following elements:"+obj);

          obj.remove(0);
          obj.add(0,"Shakhaowat");
          obj.add(1,"good boy");
          obj.add("Imran bhai");
          
          System.out.println("Currently the array list has following elements:"+obj);

          
	}
	
	

}
