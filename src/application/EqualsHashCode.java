package application;

public class EqualsHashCode {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));

		// Aqui se o hash code gerar c�digos diferentes o objeto n�o � igual
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
