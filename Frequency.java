//Program to find the frequency of the words in the given string 
import java.util.*;
public class Frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine().toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }
        System.out.println("Character\tFrequency");
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.println((char) (i + 'a') + "\t\t" + arr[i]);
            }
        }
    }
}
