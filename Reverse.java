//Reverse the pattern
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Example: 5 → EDCBA pattern

        char last = (char)('A' + n - 1);

        for (int i = 0; i < n; i++) {
            for (char j = last; j >= 'A' + i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
