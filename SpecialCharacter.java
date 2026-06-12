import java.util.*;

public class SpecialCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') || 
                  (ch >= 'a' && ch <= 'z') || 
                  (ch >= '0' && ch <= '9'))) {
                System.out.print(ch);
            }
        }
    }
}
