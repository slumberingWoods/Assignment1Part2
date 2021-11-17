/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webaddressextractor;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class WebAddressExtractor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner sc
        Scanner sc = new Scanner(System.in);
        // Print question
        System.out.print("Please input a web address: ");
        // Input "inAddress" as a string
        String inAddress = sc.nextLine();
        // Convert "inAddress" to all lowercase 
        inAddress = inAddress.toLowerCase();
        // Print inAddress
        System.out.printf("\n%-10s %1s %1s", "Address", ":", inAddress);
        // Search for heading where it starts at the begining and ends at the first period
        String heading = inAddress.substring(0, inAddress.indexOf('.'));
        // Print heading
        System.out.printf("\n%-10s %1s %1s", "Heading", ":" , heading);
        // Search for company where it starts at the period + 1 position and ends at the last period
        String company = inAddress.substring(inAddress.indexOf('.')+1, inAddress.lastIndexOf('.'));
        // Print company
        System.out.printf("\n%-10s %1s %1s", "Company", ":" , company);
        // Search for extention where it starts at the last period + 1 position and end at the length of the string
        String extention = inAddress.substring(inAddress.lastIndexOf('.')+1, inAddress.length());
        // Print extention
        System.out.printf("\n%-10s %1s %1s\n", "Extention", ":" , extention);
        
    }
    
}
