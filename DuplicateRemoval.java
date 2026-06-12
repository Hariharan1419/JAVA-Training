//Remove the duplicate 
import java.util.*;
public class DuplicateRemoval{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        System.err.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a.add(num);
    }
    ArrayList<Integer> b = new ArrayList<>();
    for (int num : a){
        if(!b.contains(num)){
            b.add(num);
        }
    }
    System.out.println("Array without duplicates " + b);
}
}
