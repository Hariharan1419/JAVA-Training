/Getting string input using ArrayList
import java.util.ArrayList;

 public class BasicOfArrayList {
    public static void main (String[] args) {
        
      	// Creating an ArrayList
      	ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
      	// Adding Element in ArrayList
      	a.add("apple");
      	a.add("cow");
      	a.add("banana");
      
      	// Printing ArrayList
      	System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"dragon fruit");
        System.out.println(a);
        a.add(0,"fruit");
        System.out.println(a);
        a.set(1,"hybrid");
        System.out.println(a);
        System.out.println(a.get(0));
        // a.clear();
        System.out.println(a.size());
        System.out.println(a.contains("hybrid"));
        // ArrayList<Integer> b = new ArrayList<>(a);
        // b=(new ArrayList<>)a.clone()  +6;
        b=a;
        System.out.println(b);
    }
}
