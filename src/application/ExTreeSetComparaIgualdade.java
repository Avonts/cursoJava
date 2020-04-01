package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Product;

public class ExTreeSetComparaIgualdade {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900));
		set.add(new Product("Notebook", 1200));
		set.add(new Product("Tablet", 400));
		
		for(Product prod:set) {
			System.out.println(prod);
		}
		
		

	}

}
