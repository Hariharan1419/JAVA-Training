//Empty subarray
import java.util.*;

public class EmptySubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> prefixCount = new HashMap<>();
        int sum = 0, count = 0;

        // Initialize with sum = 0 seen once
        prefixCount.put(0, 1);

        for (int num : arr) {
            sum += num;

            // If this sum was seen before, it means subarray(s) with sum = 0 exist
            if (prefixCount.containsKey(sum)) {
                count += prefixCount.get(sum);
            }

            // Update frequency of prefix sum
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count of subarrays with sum 0: " + count);
    }
}
