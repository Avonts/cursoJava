package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee2;

public class ExFuncionarioPipeline {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		String path = "C:\\temp\\employeePipeline.txt";
		List<Employee2> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);

				list.add(new Employee2(name, email, salary));
				line = br.readLine();

			}
			
			System.out.print("Digite o valor da margem de salário: ");
			Double lim = sc.nextDouble();

			System.out.println("Emails com salário maior que R$" + lim);
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() >= lim)
					.map(x -> x.getEmail())
					.sorted((p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase()))
					.collect(Collectors.toList());

			emails.forEach(System.out::println);
			
			
			Double sum = list.stream()
				.filter(x -> x.getName().charAt(0) == 'M')
				.map(x -> x.getSalary())
				.reduce(0.0, (x,y)->x+y);
				
			System.out.println("\nSoma dos salários que começam com 'M': " + sum);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sc.close();
		}

	}

}
