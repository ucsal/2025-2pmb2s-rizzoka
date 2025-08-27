package br.com.mariojp.solid.srp;

public class TaxCalculator {
	public double generate(ReceiptService receipt) {
	double subtotal = receipt.getSubtotal(null);
	double tax = subtotal * 0.10; //Taxa 10 fixa :(
	double total = subtotal + tax;
	return total;
	}
}
