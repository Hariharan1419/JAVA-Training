//Print the ascii value of the character 
import java.util.*;
public class AsciiValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        int b = (int) a;
        System.out.println("The ASCII value of " + a + " is: " + b);
    }
}
