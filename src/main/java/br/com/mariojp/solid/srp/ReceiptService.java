package br.com.mariojp.solid.srp;

public class ReceiptService {
	public String generate(Order order) {
		
		double tax = subtotal * 0.10; //Taxa 10 fixa :(
		double total = subtotal + tax;
		StringBuilder sb = new StringBuilder(); //Formatando o Recibo
		sb.append("=== RECIBO ===\n");
		for (var i : order.getItems()) {
			sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ").append(i.getUnitPrice() * i.getQuantity())
					.append("\n");
		}
		sb.append("Subtotal: ").append(subtotal).append("\n");
		sb.append("Tax: ").append(tax).append("\n");
		sb.append("Total: ").append(total).append("\n");
		return sb.toString();
	}
	
	public double getSubtotal(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		return subtotal;
	}

}
