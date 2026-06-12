//Second largest element in the array
import java.util.*;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
         System.out.print("Enter how many numbers you want to add: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            a.add(num);
        }
        int largest = 0;
        for (int i:a){
            if(i>largest){
                largest=i;
            }
        }
        System.out.println("The largest among the input is: " + largest);
        int sclargest = 0;
        for (int i:a){
            if(i>sclargest && largest>i){
                sclargest=i;
            }
        }
        System.out.println("The second largest is: " + sclargest);
    }
}
