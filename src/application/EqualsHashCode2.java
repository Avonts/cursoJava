package application;

import model.entities.Client;

public class EqualsHashCode2 {

	public static void main(String[] args) {

		Client c1 = new Client("Vinícius", "vinialves022@gmail.com");
		Client c2 = new Client("Milena", "mileninhaSapeca@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); 

	}

}
