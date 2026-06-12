/ Create a menu list with briyani, dessert and juices
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grandTotal = 0;

        // To store receipt details
        List<String> receipt = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu Categories:");
            System.out.println("1. Juices");
            System.out.println("2. Briyani");
            System.out.println("3. Dessert");
            System.out.println("Type 'done' to finish ordering.");
            System.out.print("Enter category: ");
            String category = sc.nextLine().toLowerCase();

            if (category.equals("done")) break;

            String item = "";
            int price = 0;

            switch (category) {
                case "juices":
                    System.out.println("* Watermelon - 40 rs");
                    System.out.println("* Apple - 25 rs");
                    System.out.println("* Orange - 35 rs");
                    System.out.println("* Grapes - 30 rs");
                    System.out.println("* Mixed Fruit Juice - 70 rs");
                    System.out.println("* Tender Coconut - 40 rs");
                    System.out.print("Enter your order: ");
                    item = sc.nextLine().toLowerCase();
                    if (item.equals("watermelon")) price = 40;
                    else if (item.equals("apple")) price = 25;
                    else if (item.equals("orange")) price = 35;
                    else if (item.equals("grapes")) price = 30;
                    else if (item.equals("mixed fruit juice")) price = 70;
                    else if (item.equals("tender coconut")) price = 40;
                    else { System.out.println("Invalid item"); continue; }
                    break;

                case "briyani":
                    System.out.println("* Empty Briyani - 120 rs");
                    System.out.println("* Chicken Briyani - 180 rs");
                    System.out.println("* Mutton Briyani - 240 rs");
                    System.out.println("* Fish Briyani - 250 rs");
                    System.out.println("* Mandhi Full - 950 rs");
                    System.out.print("Enter your order: ");
                    item = sc.nextLine().toLowerCase();
                    if (item.equals("empty briyani")) price = 120;
                    else if (item.equals("chicken briyani")) price = 180;
                    else if (item.equals("mutton briyani")) price = 240;
                    else if (item.equals("fish briyani")) price = 250;
                    else if (item.equals("mandhi full")) price = 950;
                    else { System.out.println("Invalid item"); continue; }
                    break;

                case "dessert":
                    System.out.println("* Vanilla Icecream - 15 rs");
                    System.out.println("* Chocolate Icecream - 20 rs");
                    System.out.println("* Strawberry Icecream - 25 rs");
                    System.out.println("* Raspberry Icecream - 40 rs");
                    System.out.println("* Fruit Salad - 50 rs");
                    System.out.print("Enter your order: ");
                    item = sc.nextLine().toLowerCase();
                    if (item.equals("vanilla icecream")) price = 15;
                    else if (item.equals("chocolate icecream")) price = 20;
                    else if (item.equals("strawberry icecream")) price = 25;
                    else if (item.equals("raspberry icecream")) price = 40;
                    else if (item.equals("fruit salad")) price = 50;
                    else { System.out.println("Invalid item"); continue; }
                    break;

                default:
                    System.out.println("Invalid category");
                    continue;
            }

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();
            sc.nextLine(); // consume newline

            int lineTotal = price * qty;
            grandTotal += lineTotal;

            // Save receipt line
            receipt.add(item + " | Qty: " + qty + " | Rate: " + price + " | Total: " + lineTotal);
            System.out.println(item + " added to order.");
        }

        // Print final receipt
        System.out.println("\n========== BILL RECEIPT ==========");
        for (String line : receipt) {
            System.out.println(line);
        }
        System.out.println("----------------------------------");
        System.out.println("Grand Total: " + grandTotal + " rs");
        System.out.println("==================================");
        System.out.println("Thank you for your order!");
    }
}
