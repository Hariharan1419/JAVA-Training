
//Split the array into two pairs and add the minimum values of the pairs and print the  sum (Adjacent sticks sum)
import java.util.*;

public class MinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i += 2) {
            if (arr[i] < arr[i + 1]) {
                sum += arr[i];
            } else {
                sum += arr[i + 1];
            }
        }

        System.out.println(sum);
    }
}
