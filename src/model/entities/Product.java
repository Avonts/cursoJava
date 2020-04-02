package model.entities;

public class Product {

	protected String name;
	protected double price;

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Getters e Setters

	// Name
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Price
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Métodos da classe

	public String priceTag() {

		return "\nNome: " + this.name + " Preço: R$" + String.format("%.2f", this.price);
	}

}
