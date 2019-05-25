import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestModel {

	public TestModel() {
		super();
		// TODO Auto-generated constructor stub

		System.out.println("Object for test model is created");
	}

	String url = "jdbc:mysql://localhost:3306/giraffe";
	String username = "root";
	String password = "Hanuman";

	// static method

	// return a string

	public static String getData() {
		// new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(date);
		return "Sri ram ede \t" + strDate;
	}

	void setupConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// DriverManager.registerDriver(new com.mysql.jdbc.Driver ());

		String url = "jdbc:mysql://localhost:3306/giraffe";
		String username = "root";
		String password = "Hanuman";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {

			System.out.println("Database connected!");

		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);

		}

	}

	java.util.List<Employee> list = new ArrayList<>();

	List<Employee> getEmployeListTMOdel() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(url, username, password)) {

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from jemp");

			// list = new ArrayList<>();

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String dob = resultSet.getString(3);
				String dept = resultSet.getString(4);

				list.add(new Employee(id, name, dob, dept));

				// added the fetched details frm db

//				System.out.println("my id" + resultSet.getInt(1) + "\t name:" + resultSet.getString(2) + "\t dob:"
//						+ resultSet.getString(3) + "\t dept:" + resultSet.getString(4));
			}

			// setted list

			for (Employee e : list) {
				System.out.println(e);
			}

			return list;
			// System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);

		}
	}

	boolean addEmployeeTmodel(String name, String dob, String dept) {

		String sqlquery = String.format("insert into jemp(name,dob,dept) values('%s',%s,'%s')", name, dob, dept);

		int rows = 0;

//		try (Connection connection = DriverManager.getConnection(url, username, password)) {
//
//			Statement statement = connection.createStatement();
//
//			System.out.println("going to add this idiot \t" + name + "");
//
//			// rows = statement.executeUpdate(sqlquery);
//
//			// System.out.println("rows updated" + rows);
//
//		} catch (SQLException e) {
//			throw new IllegalStateException("Cannot connect the database!", e);
//
//		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(url, username, password)) {

			Statement statement = connection.createStatement();

			rows = statement.executeUpdate(sqlquery);

			System.out.println("I am going to add this idiot \t" + name);

			System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);

		}

		return rows > 0;
	}

	boolean UpdateTable(String name, String dob, String dept) {

		String sqlquery = String.format("insert into jemp(name,dob,dept) values('%s',%s,'%s')", name, dob, dept);

		String query = String.format("update jemp set name=%s where id=1", name);
		String query2 = String.format("update jemp set dob=%s where id=1", dob);
		String query3 = String.format("update jemp set dept=%s where id=1", dept);
		
		int rows = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(url, username, password)) {

			Statement statement = connection.createStatement();

			rows = statement.executeUpdate(sqlquery);

			System.out.println("I am going to add this idiot \t" + name);

			System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);

		}

		return rows > 0;
	}

}
