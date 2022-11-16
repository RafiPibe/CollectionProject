import java.util.*;

class list {
	public static void main(String[] args) {
		List<String> animal = new ArrayList<>();
 
        animal.add("Kuda");
        animal.add("Gajah");
        animal.add("Sapi");
        animal.add("Zebra");
 
        System.out.println("List :");
        for (String fourLegs : animal)
        {
            System.out.println(fourLegs);
        }
        System.out.println("");
	}
}
