package entities;

public class OrderItem {
	
	private Integer quantity;
	private double price;
	
	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public double subTotal() {
		return quantity * price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return product + ", Quantity: " + quantity + ", Subtotal: $" + String.format("%.2f", subTotal());
	}
	
	
	
}
