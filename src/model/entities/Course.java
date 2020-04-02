package model.entities;

import java.util.HashSet;
import java.util.Set;

public class Course{

	private String name;
	private Instructor instructor;
	private Set<Student> studests = new HashSet<>();
	
	public Course() {

	}

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Set<Student> getStudests() {
		return studests;
	}

	public void setStudests(Set<Student> studests) {
		this.studests = studests;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", instructor=" + instructor + ", studests=" + studests + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((studests == null) ? 0 : studests.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (instructor == null) {
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studests == null) {
			if (other.studests != null)
				return false;
		} else if (!studests.equals(other.studests))
			return false;
		return true;
	}
	
}
