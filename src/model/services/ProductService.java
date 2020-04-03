package model.services;

import java.util.List;
import java.util.function.Predicate;

import model.entities.Product;

public class ProductService {

	public double filteredSum(List<Product> product, Predicate<Product> criteria) {
		double sum = 0;
		for (Product p : product) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
