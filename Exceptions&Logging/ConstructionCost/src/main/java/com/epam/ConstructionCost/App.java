package com.epam.ConstructionCost;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger Log  = LogManager.getLogger(App.class);
	public static OutputStreamWriter consoleWriter = new OutputStreamWriter(System.out);
	public static Scanner scanner = new Scanner(System.in);
	
	static double areaInSquareFeet = 0;
	
	static double constructionCost = 0;
	
	static int choice;
    public static void main( String[] args ) throws IOException
    {
        try {
        	Log.info("Requesting Input...");
			consoleWriter.write("Enter area of the house: ");
			consoleWriter.flush();
			
			areaInSquareFeet = scanner.nextDouble();
			
			consoleWriter.write("Materials Available: \n\n1.Standard Materials\n2.Above Standard Materials\n3.High Standard Material\n4.High Standard Material and fully Automated Home\nEnter your choice: ");
			consoleWriter.flush();
			
			choice = scanner.nextInt();
			
			Log.info("Received Input...");
		}
        catch (InputMismatchException e) {
			Log.error("Invalid Input...");
		}
        String materialModel[] = {"Standard Materials", "Above Standard Materials", "High Standard Materials", "High Standard Materials and fully automated Home"};
        try {
        	constructionCost = Calculation.calculation(choice-1, areaInSquareFeet);
        	consoleWriter.write("The construction cost using " + materialModel[choice-1] + " is : " + String.valueOf(constructionCost)+ " rupees\n");
        	consoleWriter.flush();
        	Log.info("Construction cost is successfully calculated...");
        }
        catch (IndexOutOfBoundsException e) {
			Log.error("Invalid Choice...");
		}
        
    }
}
