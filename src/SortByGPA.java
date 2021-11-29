import java.util.Comparator;

// Sap xep sinh vien theo gpa

public class SortByGPA implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		if (student1.getGPA() > student2.getGPA()) {
			return 1;
		}
		return -1;
	}
}
