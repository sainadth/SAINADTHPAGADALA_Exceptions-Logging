package com.epam.InterestCalculation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest implements CalculateInterest{

	private static final Logger Log  = LogManager.getLogger(CompoundInterest.class);
	@Override
	public double calculation(double principalAmount, double timeInYears, double interestRate) {
		Log.info("Inside calculation() of CompoundInterest class");
		Log.info("Calculating Compound Interest...");
		Log.info("Exiting calculate method...");
		return principalAmount * (Math.pow(1 + interestRate / 100, timeInYears) - 1);
	}

}
