package CoreSpring.CoreSpring;

public class Student {
	
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		//System.out.println("Sudent id ");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//System.out.println("Student name");
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		//System.out.println("Student Address");
		this.address = address;
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
