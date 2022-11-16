import java.util.*;

class map {

	public static void main(String args[]) {
		//using Map
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Kuda");
        map.put(2, "Gajah");
        map.put(3, "Sapi");
        map.put(4, "Zebra");
 
        System.out.println("Map :");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("");
	}
}
