
//Program for sum of inputs in the given array

import java.util.*;

public class SumOfInputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        // Read array size
        int n = sc.nextInt();
        int[] a = new int[n];

        // Read array elements and calculate sum
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
		if(a[i]>0){
            sum += a[i];
		}
        }

        // Print results
        System.out.println("Array size: " + n);

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // new line

        System.out.println("Sum of elements: " + sum);
    }
}
