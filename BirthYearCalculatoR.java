/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthyearcalculator;
import java.util.Scanner;

/**
 *
 * @author Thang Manh Tran
 */
public class BirthYearCalculatoR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create scanner sc
        Scanner sc = new Scanner(System.in);
        // Print a question to ask for a year
        System.out.print("Enter a birth year: ");
        // Input a year as a string
        String year = sc.nextLine();
        // Print year
        System.out.printf("%-10s %1s %1s \n", "Birth Year", ":" , year);
        // Parse the century
        int century = Integer.parseInt(year.substring(0,year.length()-2))+1;
        // Print century
        System.out.printf("%-10s %1s %1s \n", "Century", ":" , century);
        // Parse the decade 
        int decade = Integer.parseInt(year.substring(year.length()-2,year.length()-1));
        decade *= 10;
        // Print decade
        System.out.printf("%-10s %1s %1s \n", "Decade", ":" , decade);
    }
    
}
