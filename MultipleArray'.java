import java.util.*;

public class MultipleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }

        System.out.println("Output:");
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                System.out.print((product / arr[i]) + " ");
            } 
        }
    }
}
