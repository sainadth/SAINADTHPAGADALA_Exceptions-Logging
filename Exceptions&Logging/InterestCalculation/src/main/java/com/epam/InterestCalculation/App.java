package com.epam.InterestCalculation;

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
	
	static double principalAmount	= 0;
	static double interestRate = 0;
	static double timeInYears = 0;
	
	static double interestAmount = 0;
	static int choice;
    public static void main( String[] args ) throws IOException
    {
    	try {
	    	Log.info("Requesting Input...");
	        consoleWriter.write("Enter principal amount: ");
	        consoleWriter.flush();
	        principalAmount = scanner.nextDouble();
	        
	        consoleWriter.write("Enter time duration: ");
	        consoleWriter.flush();
	        timeInYears = scanner.nextDouble();
	        
	        consoleWriter.write("Enter rate of interest: ");
	        consoleWriter.flush();
	        interestRate = scanner.nextDouble();
	        Log.info("Received Input...");
	        
	        consoleWriter.write("Calculate\n1.Simple Interest\n2.Compund Interest\nEnter your choice: ");
	        consoleWriter.flush();
	        
	        choice = scanner.nextInt();
    	}
    	catch (InputMismatchException e) {
			Log.error("Invalid Input...");
		}
        
        String Interest[] = {"Simple Interest is: ", "Compound Interest is: "};
        CalculateInterest calculateInterest[] = {new SimpleInterest(), new CompoundInterest()};
        
        try {
        	interestAmount = calculateInterest[choice-1].calculation(principalAmount, timeInYears, interestRate);
        	consoleWriter.write(Interest[choice-1]+String.valueOf(principalAmount + interestAmount)+"\n");
        	consoleWriter.flush();
        	Log.info("Interest Successfully calculated...");
        }
        catch (IndexOutOfBoundsException e) {
			Log.error("Invalid choice...");
		}
    }
}
