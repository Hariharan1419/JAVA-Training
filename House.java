/Array hopping problem
import java.util.*;

public class House {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter number of houses (N): ");
        int N = sc.nextInt();
        int[] A = new int[N];

        // Input array elements
        System.out.println("Enter the values for each house:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Track visited houses
        int count = 0;
        int i = 0;
        List<Integer> path = new ArrayList<>(); // to store the path

        while (i < N) {
            count++;
            path.add(i); // record the current house
            if (i == N - 1) break; // reached last house
            i = i + A[i]; // jump
            if (i >= N) break; // out of bounds
        }

        // Output
        System.out.println("Total houses visited: " + count);
        System.out.println("Path of houses visited: " + path);
    }
}
