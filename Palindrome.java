// palindrome of the string without using in-built functions    
import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = sc.nextLine();
        String b = "";
        for (int i=a.length()-1; i>=0; i--){
            b = b+a.charAt(i);
        }
        System.out.println(a.equalsIgnoreCase(b)? " It is a palindrome.": " It is not a palindrome.");
    }
}
