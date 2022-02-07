package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	//calcula o valor que tem no estoque
	public double totalValueInStock() {
		return price*quantity;
	}
	
	//adiciona na quantidade de produtos
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	//remove a quantidade de produtos
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name +", $ "+String.format("%.2f", price)+", "+quantity+" units, Total: $"+String.format("%.2f", totalValueInStock());
	}
}
