package com.nit.beans;

public class ElectricityBillGenerator {

	private double unitsConsumed;

	private double ratePerUnit;

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public double generateBill() {
		
		double  bill = unitsConsumed * ratePerUnit;
		
		return bill;

	}

}
