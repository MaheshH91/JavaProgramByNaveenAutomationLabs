package test;

import java.util.ArrayList;
import java.util.List;
//Find Student Name Holding Highest Marks || List with Objects & Streams 
public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Mahesh", 101, 90, 15);
		Student s2 = new Student("Sharanya", 102, 99, 1);
		Student s3 = new Student("Reshma", 103, 77, 26);
		Student s4 = new Student("Sonu", 104, 97, 17);
		Student s5 = new Student("Monu", 105, 80, 16);

		// Add all studemt obj in ArrayList
		List<Student> studentList = new ArrayList<Student>();

		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);

		System.out.println("Total Student: " + studentList.size());

		for (Student s : studentList) {
			System.out.println(s);
		}
		System.out.println("***********");
		studentList.stream().forEach(e -> System.out.println(e));
//marks >80
		studentList
			.stream()
			.filter(e -> e.getMarks() > 80)
				.forEach(e -> System.out.println(e.getName() + " : " + e.getMarks()));
		// highest marks
		int highestMarks = studentList.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		System.out.println("Highest Marks: " + highestMarks);
		
		studentList.stream().filter(e->e.getMarks()==highestMarks).forEach(e -> System.out.println(e));;
	}
}
