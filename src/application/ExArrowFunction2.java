package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class ExArrowFunction2 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900));
		list.add(new Product("Mouse", 50));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));

		double min = 100;

		list.removeIf((p1) -> p1.getPrice() >= min);

		for (Product p : list) {
			System.out.println(p);
		}

	}

}
