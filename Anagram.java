//Anagram of the string
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the word 2:");
        String str2 = sc.nextLine();
        
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings aren't anagrams");
        }

        sc.close();
    }
}
