package datastructure;
import databases.ConnectDB;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Iterator;
import java.util.Map;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		ArrayList<Object> list = new ArrayList<>();
		list.add("Mohammad");
		list.add("mafi bhai's ");
		list.add("midtermExam");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:" + list);

		list.remove(0);
		list.add(0, "Shakhaowat's ");
		list.add(1, "Answer");


		System.out.println("After remove the array list has following elements:" + list);

		ConnectDB connectDB = new ConnectDB();
		connectDB.InsertDataFromArrayListToMySql(list, "user", "Name");
		try {
			connectDB.readDataBase("user", "name");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//using Iterator
		Iterator it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (Object st : list) ;
		System.out.println(list);
	}

}