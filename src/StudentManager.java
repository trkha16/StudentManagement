
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class StudentManager {
	public static Scanner scanner = new Scanner(System.in);
	private List<Student> studentList = new ArrayList<Student>();
	
	// Add thong tin student vao list
	public void add() {
		// Nhap id name age address gpa
		int id = getId();
		String name = inpName();
		byte age = inpAge();
		String address = inpAddress();
		float gpa = inpGPA();
		
		Student student = new Student(id, name, age, address, gpa);
		
		// luu thong tin student vao studentList
		studentList.add(student);
	}
	
	// Lay id cua student
	public int getId() {
		System.out.print("Input id ");
		while (true) {
			try {
				int id = Integer.parseInt(scanner.nextLine());
				return id;
			}
			catch(NumberFormatException e) {
				System.out.print("Invalid! Input ID again ");
			}
		}
	}
	
	// Nhap name cua student
	private String inpName() {
		System.out.print("Input Name ");
		return scanner.nextLine();
	}
	
	// Nhap age cua student
	private byte inpAge() {
		System.out.print("Input Age ");
		while (true) {
			try {
				byte age = Byte.parseByte(scanner.nextLine());
				if (age < 0) {
					throw new NumberFormatException();
				}
				return age;
			}
			catch(NumberFormatException e) {
				System.out.print("Invalid! Input age again ");
			}
		}
	}
	
	// Nhap Address cua student
	private String inpAddress() {
		System.out.print("Input Address ");
		return scanner.nextLine();
	}
	
	// Nhap GPA cua student
	private float inpGPA() {
		System.out.print("Input GPA ");
		while (true) {
			try {
				float gpa = Float.parseFloat(scanner.nextLine());
				if (gpa < 0 || gpa > 10) {
					throw new NumberFormatException();
				}
				return gpa;
			}
			catch(NumberFormatException e) {
				System.out.print("Invalid! Input gpa again ");
			}
		}
	}
	
	// Edit thong tin student by id
	public void edit(int id) {
		boolean isExit = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getId() == id) {
				isExit = true;
				studentList.get(i).setName(inpName()); // Edit name
				studentList.get(i).setAge(inpAge()); // Edit age
				studentList.get(i).setAddress(inpAddress()); // Edit Address
				studentList.get(i).setGPA(inpGPA()); // Edit GPA
				break;
			}
		}
		
		if (isExit == false) {
			System.out.println("Id " + id + " not existed!");
		}
		else {
			System.out.println("Student has changed!");
		}
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
		System.out.format("%5s | ", "ID");
		System.out.format("%20s | ", "NAME");
        System.out.format("%5s | ", "AGE");
        System.out.format("%20s | ", "ADDRESS");
        System.out.format("%10s", "GPA");
        System.out.println();
		for (Student student: studentList) {
			System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGPA());
		}
	}
	
}

