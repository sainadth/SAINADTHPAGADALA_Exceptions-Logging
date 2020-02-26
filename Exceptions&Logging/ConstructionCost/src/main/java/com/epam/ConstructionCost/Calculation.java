package com.epam.ConstructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculation {
	private static final Logger Log  = LogManager.getLogger(Calculation.class);
	static double perSquareFeetCost[] = {1200, 1500, 1800, 2500};
	public static double calculation(int index, double areaInSquareFeet) {
		Log.info("Inside calculation() of Caluclation class");
		Log.info("Exiting calculate method...");
		return perSquareFeetCost[index]*areaInSquareFeet;
	}
}