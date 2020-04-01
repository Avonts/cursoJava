package application;

import java.util.HashSet;
import java.util.Set;

import model.entities.Product;

public class ExSetTestaIgualdade {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900));
		set.add(new Product("Notebook", 1200));
		set.add(new Product("Tablet", 400));
		
		Product prod = new Product("Notebook", 1200);
		
		System.out.println(set.contains(prod));
		

	}

}
