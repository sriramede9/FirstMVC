import java.util.*;

public class Employee {

	

	private int id;
	private String name;
	private String dob;
	private String dept;

	private List<Employee> emplist = new ArrayList<>();
	
	

	public Employee(int id, String name, String dob, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.dept = dept;

		
	}

	public void addEmployee(Employee e) {
		emplist.add(e);
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		System.out.println("emp object list setted"+emplist);
		this.emplist.addAll(emplist);
	}

	// update

	public boolean update(Employee e) {
		//updated
		
		System.out.println("Mr>"+e.getName()+"updated");
		return true;
	}

	// delete

	public boolean delete(Employee e) {
		System.out.println("Mr" + e.getName() + "is deleted");
		emplist.remove(e);
		return true;
	}

	// save
	public boolean Save(Employee e) {

		emplist.add(e);

		System.out.println("newly created emp added saved!");

		return true;
	}

	public Employee getEmployee(int i) {
		return emplist.get(i);
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
		return this.id + " " + this.name + " " + this.dob + " " + this.dept;
	}

}
