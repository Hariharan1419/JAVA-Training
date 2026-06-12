//Butterfly pattern in java
import java.util.Scanner;
public class Butterfly {    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);    
System.out.print("Enter the number of rows for the butterfly pattern: ");
int n = sc.nextInt();
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
for (int j = 1; j <= 2 * (n - i); j++) {
System.out.print(" ");
}   
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
System.out.println();
}                       
for (int i = n; i >= 1; i--) {
for (int j = 1; j <= i; j++) {
System.out.print("*");
}                           
for (int j = 1; j <= 2 * (n - i); j++) {
System.out.print(" ");
}
for (int j = 1; j <= i; j++) {      

System.out.print("*");
}
System.out.println();
}
}}
