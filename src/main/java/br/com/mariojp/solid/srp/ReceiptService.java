package br.com.mariojp.solid.srp;

public class ReceiptService {

	public String generate(Order order) {
		double subtotal = getSubtotal(order);
		
		TaxCalculator taxCalculator = new TaxCalculator();
		double tax = taxCalculator.calcularTaxa(subtotal);
		
		double total = subtotal * tax;

	    String strSubtotal = String.format("%.1f", subtotal);
        String strTax = String.format("%.2f", tax);
        String strTotal = String.format("%.2f", total);
		
		ReceiptFormatter formatter = new ReceiptFormatter();
		return formatter.generate(order, strSubtotal, strTax, strTotal);
	}
	
	public double getSubtotal(Order order) {
		return order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
	}
	

}
