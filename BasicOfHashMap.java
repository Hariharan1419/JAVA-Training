//HashMap for getting key-value pairs
import java.util.*;
import java.util.HashMap;
public class BasicOfHashMap{
    public static void main(String[] args){
        HashMap<Integer, String> studentName = new HashMap<>();
        studentName.put(2425, "Guha Bava Jaya Sre A");
        studentName.put(2426, "Hariharan");
        studentName.put(2460, "Asif");
        studentName.put(2425, "Guha Bava Jaya Sre A");
        studentName.put(2462, "Tharik");
        System.out.println(studentName);
        studentName.remove(2426);
        System.out.println(studentName);
         System.out.println(studentName.get(2425));
    }
}
