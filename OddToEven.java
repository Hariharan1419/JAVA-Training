// Odd to even and even to odd count calculator 
import java.util.Scanner;

public class OddRoEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int oddToEven = 0;
        int evenToOdd = 0;

        // Count transitions
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 == 0) {
                oddToEven++;
            } else if (arr[i] % 2 == 0 && arr[i + 1] % 2 != 0) {
                evenToOdd++;
            }
        }

        // Output results
        System.out.println("Odd to Even transitions: " + oddToEven);
        System.out.println("Even to Odd transitions: " + evenToOdd);

        sc.close();
    }
}
