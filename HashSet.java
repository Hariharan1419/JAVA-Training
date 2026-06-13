//Basic of HashSet
import java.util.*;
public class HashSet{
    public static void main(String[] args){
        Set<Integer> a = new TreeSet<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);
        System.out.println(a);
        System.out.println("Size of the set " + a.size());
        System.out.println("The element contains the value 20: " + a.contains(20));
    }
}
