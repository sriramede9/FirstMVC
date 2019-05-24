
public class Employee {

	
	private int id;
	private String name;
	private String dob;
	private String dept;
	
	public Employee(int id, String name, String dob, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.dob+" "+this.dept;
	}
	
	
	
}
