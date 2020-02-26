package com.epam.InterestCalculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest implements CalculateInterest{
	
	private static final Logger Log  = LogManager.getLogger(SimpleInterest.class);
	@Override
	public double calculation(double principalAmount, double timeInYears, double interestRate) {
		Log.info("Inside calculation() of SimpleInterest class");
		Log.info("Calculating Simple Interest...");
		Log.info("Exiting calculate method...");
		return principalAmount*timeInYears*interestRate/100;
	}

}
