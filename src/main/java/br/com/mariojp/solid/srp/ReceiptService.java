package br.com.mariojp.solid.srp;

public class ReceiptService {

	public String generate(Order order) {
		double subtotal = getSubtotal(order);
		
		TaxCalculator taxCalculator = new TaxCalculator();
		double tax = taxCalculator.calcularTaxa(subtotal);
		
		double total = subtotal * tax;
		
		ReceiptFormatter formatter = new ReceiptFormatter();
		return formatter.generate(order, subtotal, tax, total);
	}
	
	public double getSubtotal(Order order) {
		return order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
	}
	

}
