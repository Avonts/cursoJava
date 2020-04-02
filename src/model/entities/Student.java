package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private Integer codigo;
	private String name;
	private Set<Course> courses = new HashSet<>();
	
	public Student() {

	}
	
	public Student(Integer codigo, String name, Set<Course> courses) {
		this.codigo = codigo;
		this.name = name;
		this.courses = courses;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
}
