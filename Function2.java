package com.function;

import java.util.ArrayList;
import java.util.function.Function;

class Student {

	String name;
	int percentage;

	public Student(String name, int percentage) {
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return name + "  " + percentage;
	}

}

public class Function2 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		Function2 function2 = new Function2();
		function2.populate(students);
		System.out.println(students);
		Function<Student, String> f = s -> {
			if (s.percentage >= 80) {
				return "A[Distinction]";
			} else if (s.percentage >= 60) {
				return "B[GOOD]";
			} else if (s.percentage >= 50) {
				return "C[AVERAGE]";
			} else if (s.percentage >= 35) {
				return "D[REALLY BAD BRO]";
			} else {
				return "E[FAILLLL]";
			}
		};
		for (Student s : students) {
			System.out.println(s.name + " " + f.apply(s));
		}
	}

	public void populate(ArrayList<Student> students) {
		students.add(new Student("A", 85));
		students.add(new Student("B", 75));
		students.add(new Student("C", 65));
		students.add(new Student("D", 55));
		students.add(new Student("E", 45));
		students.add(new Student("F1", 35));
		students.add(new Student("F2", 25));
		students.add(new Student("G", 85));
	}

}
