package datastructure;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */



		//create object for map
		//set <key,value>;
		Map<Integer, String> map = new HashMap<>();
		//Integer key,string value;
		map.put(0, "Vegetables");
		map.put(1, "Carrot");
		map.put(2, "Apples");
		map.put(3, "Oranges");
		map.put(4, "Avacado");
		System.out.println("Before Deletion Values are:");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m);
		}

		System.out.println();

		System.out.println("Calling by key:");
		System.out.println(map.get(0));
		System.out.println();
		map.remove(0);

		map.replace(4,"Avacado", "Banana");
		System.out.println("After Deletion Values are:");
		for(Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m);
		}
		System.out.println();
		System.out.println("Calling by Iterator Object:");
		Iterator<Map.Entry<Integer, String>> It = map.entrySet().iterator();
		while (It.hasNext()) {
			System.out.println(It.next());
		}

	}


		}





