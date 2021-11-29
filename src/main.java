import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choose = null; // Bien choose dung de nhap menu
		boolean exit = false; // Kiem tra exit
		StudentManager studentManager = new StudentManager();
		
		
		showMenu();
		
		// Nhap du lieu
		while (true) {
			choose = scanner.nextLine();
			switch(choose) {
			case "1": // Add student
				studentManager.add();
				break;
			case "2": // Edit student by id
				break;
			case "3": // Delete student by id
				studentManager.delete(studentManager.getId());
				break;
			case "4": // Sort student by gpa
				studentManager.sortStudentByGPA();
				break;
			case "5": // Sort student by name
				studentManager.sortStudentByName();
				break;
			case "6": // Show student 
				studentManager.show();
				break;
			case "0": // Exit program
				System.out.println("Exited!");
				exit = true;
				break;
			default:
				System.out.println("invalid! please choose action in below menu:");
				break;
			}
			if (exit) {
				break;
			}
			
		}
		

	}
	
	public static void showMenu() {
		System.out.println("-----------menu------------");
		System.out.println("1. Add student.");
		System.out.println("2. Edit student by id.");
		System.out.println("3. Delete student by id.");
		System.out.println("4. Sort student by gpa.");
		System.out.println("5. Sort student by name.");
		System.out.println("6. Show student.");
		System.out.println("0. Exit.");
		System.out.println("---------------------------");
	}

}
