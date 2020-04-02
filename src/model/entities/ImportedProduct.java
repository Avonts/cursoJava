package model.entities;

public class ImportedProduct extends Product{

	private double customsFee;
	
	public ImportedProduct() {}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		return "\nNome: " + this.name + "Preço: R$" + String.format("%.2f", totalPrice()) +" (Custom fee: $"+customsFee+")";
	}
	
	public double totalPrice() {
		return price+customsFee;
	}
	
}
