//Program for pattern 
import java.util.*;

public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Example: 5 → starts from 'E'

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + (n - 1 - i)); // E, D, C, B, A
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
