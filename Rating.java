// Rating program and mean

import java.util.*;
public class Rating{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rating[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.print("Enter rating (1-5) of the product"+(i+1)+": ");
            rating[i]=sc.nextInt();
            sum+=rating[i];
            while(rating[i]<0||rating[i]>5){
                    System.out.println("Invalid rating! Rate between(0-5)");
                    System.out.print("Enter rating (1-5) of the product"+(i+1)+": ");
                    rating[i]=sc.nextInt();
                    sum+=rating[i];
        }}
        System.out.println("The mean of the orders are: " +  (float)sum/5);
        System.out.println((float)sum/5>3.8?"Discount available!!":"No discount! Try next time.");
    }
}


        System.out.println("\nCount of vowels: " + count);
    }
}
