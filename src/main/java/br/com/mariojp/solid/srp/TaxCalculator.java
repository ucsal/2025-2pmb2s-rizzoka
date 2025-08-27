package br.com.mariojp.solid.srp;

public class TaxCalculator {
	public double calcularTaxa(double subtotal) {
		String taxRateString = System.getProperty("tax.rate", "0.10");
		double taxRate = Double.parseDouble(taxRateString);
		double tax = subtotal * taxRate; 
		return tax;
	}

}
