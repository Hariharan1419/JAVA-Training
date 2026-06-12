// Combine two seperate arrays into a single array and print the combined array
import java.util.*;
public class CombineArray{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the first array: ");
int a = sc.nextInt();
System.out.print("Enter the size of the second array: ");
int b = sc.nextInt();
int[] ar1 = new int [a];
int[] ar2 = new int [b];
int[] ar3 = new int [a+b];
System.out.println("Enter the elements of the first array: ");
for (int i = 0; i<a; i++){
ar1[i] = sc.nextInt();
}
System.out.println("Enter the elements of the second array: ");
for (int j = 0; j<b; j++){
ar2[j] = sc.nextInt();
}
System.out.println("The combined array is: ");  
for (int i = 0; i<a+b; i++){    
if (i<a){ 
ar3[i] = ar1[i];
}
else{
ar3[i] = ar2[i-a];              
}   
System.out.print(ar3[i] + " ");
}
}}
