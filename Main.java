mport java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 4;
         for (int i = 0; i < 5; i++) {
            char last = (char)('A' + x);
            for (int j = (n-1); j >=  i; j--) 
                System.out.print((char)(last) + " ");
            x--;
            System.out.println();
        }
    }
}
