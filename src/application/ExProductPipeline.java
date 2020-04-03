package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import model.entities.Product;

public class ExProductPipeline {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String path = "C:\\temp\\productPipeline.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			List<Product> list = new ArrayList<>();

			while (line != null) {

				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();

			}

			double avg = list.stream().map(x -> x.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();

			System.out.println("Somatória: R$" + String.format("%.2f", avg));

			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(x -> x.getPrice() < avg)
					.map(x -> x.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());

			names.forEach(System.out::println);

			// System.out.println("Sum: ");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
