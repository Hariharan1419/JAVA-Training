//Frequency of each element in the array    
import java.util.Scanner;
public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Element\tFrequency");
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MIN_VALUE; // Mark as counted
                }
            }
            if (arr[i] != Integer.MIN_VALUE) {
                System.out.println(arr[i] + "\t" + count);
            }
        }
    }
}
