/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingpricecalculator;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner sc
        Scanner sc = new Scanner(System.in);
        // Print question to ask for the number of minute parked
        System.out.print("Please input for the minutes your car has parked: ");
        // Declare the number of minutes parked as an double input
        double minute = sc.nextDouble();
        // Print minutes parked
        System.out.printf("%-25s %1s %1.0f\n", "Parking time (minutes)", ":", minute);
        // Declare hour as the conversion of minutes rounded up using math.ceil
        double hour = Math.ceil((minute/60));
        // Print the number of hours 
        System.out.printf("%-25s %1s %1.0f\n", "Parking time (hours)", ":", hour);
        // Declare parking ratio as a double
        double parkingRatio = 2;
        // Declare price as parkingRatio times hours
        double price = parkingRatio * hour;
        // Output the price 
         System.out.printf("%-25s %1s %1.2f\n", "Price", ":", price);
    }
    
}
