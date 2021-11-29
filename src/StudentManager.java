
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
	public static Scanner scanner = new Scanner(System.in);
	private List<Student> studentList;
	
	// Add thong tin student vao list
	public void add() {
		// Nhap id name age address gpa
		System.out.print("Input id ");
		int id = getId();
		scanner.nextLine();
		System.out.print("Input id ");
		String name = scanner.nextLine();
		System.out.print("Input id ");
		byte age = scanner.nextByte();
		scanner.nextLine();
		System.out.print("Input id ");
		String address = scanner.nextLine();
		System.out.print("Input id ");
		float gpa = scanner.nextFloat();
		
		Student student = new Student(id, name, age, address, gpa);
		
		// luu thong tin student vao studentList
		studentList.add(student);
	}
	
	// Lay id cua student
	public int getId() {
		int id = scanner.nextInt();
		return id;
	}
	
	// Xoa thong tin student theo id
	public void delete(int id) {
		Student student = null;
		
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) { // Neu tim thay id
				student = studentList.get(i);
				break;
			}
		}
		if (student != null) { // Neu tim thay id
			studentList.remove(student); // Xoa student
		}
		else { // Neu khong tim thay
			System.out.println("Id not existed!");
		}
	}
	
	// Sort student by name
	public void sortStudentByName() {
		Collections.sort(studentList, new SortByName());
	}
	
	// Sort student by GPA
	public void sortStudentByGPA() {
		Collections.sort(studentList, new SortByGPA());
	}
	
	// Show thong tin student
	public void show() {
		for (Student student: studentList) {
			System.out.printf("%5d | ", student.getId());
			System.out.printf("%20s | ", student.getName());
			System.out.printf("%5d | ", student.getAge());
			System.out.printf("%20s | ", student.getAddress());
			System.out.printf("%10.1f%n | ", student.getGPA());
		}
	}
	
}

