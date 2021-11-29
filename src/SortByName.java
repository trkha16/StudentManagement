import java.util.Comparator;

// sap xep sinh vien theo Name

public class SortByName implements Comparator<Student> {
	public int compare(Student student1, Student student2) {
		return student1.getName().compareTo(student2.getName());
	}
}
