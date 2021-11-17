/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplestatisticscalculator;
import java.util.Scanner;
/**
 *
 * @author Thang Manh Tran
 */
public class SimpleStatisticsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner sc
        Scanner sc = new Scanner(System.in);
        // Print question asking for 5 number
        System.out.print("Please enter in 5 numbers seperated by a space: ");
        // Input the five numbers
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();
        // Print numbers
        System.out.printf("%-20s %1s %1.2f, %1.2f, %1.2f, %1.2f, %1.2f\n", "Numbers", ":" , num1, num2, num3, num4, num5);
        // Declare n as the number of numbers
        int n = 5;
        // Declare mean as a double as the average of all number
        double mean = (num1+num2+num3+num4+num5)/n;
        // Print mean
        System.out.printf("%-20s %1s %1.2f\n", "Mean", ":", mean);
        // Find the smallest number using nested Math.min
        double smallest;
        smallest = Math.min(num1,Math.min(num2, Math.min(num3, Math.min(num4, num5))));
        // Print smallest
        System.out.printf("%-20s %1s %1.2f\n", "Smallest", ":", smallest);
        // Find the largest number using nested Math.max
        double largest;
        largest = Math.max(num1,Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        // Print largest number
        System.out.printf("%-20s %1s %1.2f\n", "Largest", ":", largest);
        // declare sum as being the sum of each numebr minus the mean squared
        double sum = (Math.pow((num1-mean),2)+Math.pow((num2-mean),2)+Math.pow((num3-mean),2)+Math.pow((num4-mean),2)+Math.pow((num5-mean),2));
        // Convert sum into absolute value of sum
        sum = Math.abs(sum);
        // Calculate standard deviation
        double standardDeviation = Math.pow((sum/n),0.5);
        // Print standard deviation
        System.out.printf("%-20s %1s %1.2f\n", "Standard Deviation", ":", standardDeviation);

    }

}
