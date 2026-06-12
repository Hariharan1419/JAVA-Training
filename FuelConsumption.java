/Fuel consumptions of a vehicle
import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter the no of liters to fill the tank");
        float liters = sc.nextFloat();

        System.out.println("Enter the distance covered");
        float distance = sc.nextFloat();

        // Validation
        if (liters <= 0 || distance <= 0) {
            System.out.println("is an Invalid Input");
        } else {
            
            float litersPer100Km = (liters / distance) * 100;

           
            float miles = distance * 0.6214f;
            float gallons = liters * 0.2642f;

            
            float milesPerGallon = miles / gallons;

            // Output with two decimal places
            System.out.printf("Liters/100KM\n%.2f\n", litersPer100Km);
            System.out.printf("Miles/gallons\n%.2f\n", milesPerGallon);
        }

        sc.close();
    }
}
