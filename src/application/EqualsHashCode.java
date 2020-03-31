package application;

public class EqualsHashCode {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Alex";

		System.out.println(a.equals(b));

		// Aqui se o hash code gerar códigos diferentes o objeto não é igual
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
