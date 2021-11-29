import java.util.Scanner;

public class StudentManager {
	public static Scanner scanner = new Scanner(System.in);
	private List<Student> studentList;
	
	// Add thong tin student vao list
	public void add() {
		// Nhap id name age address gpa
		int id = scanner.nextInt();
		scanner.nextLine();
		String name = scanner.nextLine();
		byte age = scanner.nextByte();
		scanner.nextLine();
		String address = scanner.nextLine();
		float gpa = scanner.nextFloat();
		
		Student student = new Student(id, name, age, address, gpa);
		
		// luu thong tin student vao studentList
		studentList.add(student);
	}
	
}
