package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Course;

public class ExPortalCursoOnline {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Course> courses = new HashSet<>();
		/*Set<Student> students;
		Set<Instructor> instructors;*/

		System.out.println("Portal Curso Online");

		System.out.print("Quantos cursos deseja adiconar? ");
		int qtd = sc.nextInt();

		sc.nextLine();
		for (int i = 1; i <= qtd; i++) {
			System.out.print("Nome curso: ");
			String nomeCurso = sc.nextLine();
			courses.add(new Course(nomeCurso));
		}

		System.out.println(courses);
		
		System.out.println();
		System.out.print("Quantos instrutores você deseja adiconar?:");
		qtd = sc.nextInt();

		System.out.println("Professor(s):");
		sc.nextLine();
		for (int i = 1; i <= qtd; i++) {

			/*System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Disciplina: ");
			String disciplina = sc.nextLine();*/
			
			courses.hashCode();
			
		}
		
		sc.close();

	}

}
