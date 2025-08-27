package br.com.mariojp.solid.srp;

public class TaxCalculator {
	public double Total(double subtotal) {
		double taxRate = Double.parseDouble(System.getProperty("taxRate"));
		double tax = subtotal * taxRate; 
		return tax;
	}

}
