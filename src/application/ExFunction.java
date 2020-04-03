package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.Product;
import model.entities.UpperCaseName;

public class ExFunction {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD case", 80.90));

		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		/*list.forEach(p -> p.setName(p.getName().toUpperCase()));*/
		names.forEach(System.out::println);

	}

}
