
// Class nay dung de luu thong tin Student

public class Student {
	private int id; // Khoi tao id
	private String name; // Khoi tao ten
	private byte age; // Khoi tao tuoi 
	private String address; // Khoi tao dia chi 
	private float gpa; // Khoi tao diem trung binh
	
	// Khoi tao constructor
	public Student(){
	}
	
	// Constructor co tham so
	public Student(int id, String name, byte age, String address, float gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	
	// Set get id
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	// Set get name
	public void setName(String name) {
		this.name = name;
	}
		
	public String getName() {
		return name;
	}
		
	// Set get age
	public void setAge(byte age) {
		this.age = age;
	}
				
	public byte getAge() {
		return age;
	}
	
	// Set get address
	public void setAddress(String address) {
		this.address = address;
	}
					
	public String getAddress() {
		return address;
	}
	
	// set get gpa
	public void setGPA(float gpa) {
		this.gpa = gpa;
	}
	
	public float getGPA() {
		return gpa;
	}
	
}
