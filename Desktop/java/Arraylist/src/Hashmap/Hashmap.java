package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
	
		Map<String,String>Mymap=new HashMap<>();
		
	    Mymap.put("Bangladesh", "Dhaka");
	    Mymap.put("India", "Delhi");
	    for(Map.Entry en:Mymap.entrySet()){
	    	
	    	System.out.println(en.getValue()+" "+en.getKey());
	    	
	    }

	}

}
