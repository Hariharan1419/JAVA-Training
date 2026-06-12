//Count the vowels in the given word
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        int count = 0;

        System.out.print("Vowels: ");

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(word.charAt(i) + " ");
                count++;
            }
        }

        System.out.println("\nCount of vowels: " + count);
    }
}
