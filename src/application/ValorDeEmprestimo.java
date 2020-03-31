package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class ValorDeEmprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);

		System.out.print("Payment after " + months + " months: R$");
		System.out.print(String.format("%.2f", payment));

		sc.close();
	}

}
