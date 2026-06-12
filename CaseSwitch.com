//Convert upper to lower and lower to upper without in-built functions
import java.util.*;
import java.lang.*;
public class CaseSwitch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        int b = (int) a;
        System.out.println(b>96?(char)(b-32):(char)(b+32));
    }
}
