package br.com.mariojp.solid.srp;

public class ReceiptService {

	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = TaxCalculator.calcularTaxa(subtotal);
		double total = subtotal + tax;
		String sb = ReceiptFormatter.formatador(order, subtotal, tax, total);
		return sb.toString();
	}

}
