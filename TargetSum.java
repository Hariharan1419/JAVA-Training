//Program to find the target sum in the array without using brute force method and Hashset
import java.util.*;
public class TargetSum{ 
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int n = sc.nextInt();
int[] arr = new int[n];
System.out.print("Enter the elements of the array: ");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}   
System.out.print("Enter the target sum: ");                 
int target = sc.nextInt();
Arrays.sort(arr);                       
int left = 0;                   
int right = n - 1;
boolean found = false;
while (left < right) {
int sum = arr[left] + arr[right];
if (sum == target) {
System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
found = true;
break;
} else if (sum < target) {
left++;
} else {
right--;
}
}
if (!found) {
System.out.println("No pair found that sums to " + target);
}
}}
