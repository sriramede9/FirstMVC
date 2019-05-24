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

	// static method

	// return a string

	public static String getData() {
		// new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String strDate = dateFormat.format(date);
		return "Sri ram ede \t" + strDate;
	}

	List<Employee> setupConnection() {

		java.util.List<Employee> list;
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
			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("select * from jemp");

			list = new ArrayList<>();

			while (resultSet.next()) {
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String dob = resultSet.getString(3);
				String dept = resultSet.getString(4);

				list.add(new Employee(id, name, dob, dept));

//				System.out.println("my id" + resultSet.getInt(1) + "\t name:" + resultSet.getString(2) + "\t dob:"
//						+ resultSet.getString(3) + "\t dept:" + resultSet.getString(4));
			}
			
			for(Employee e:list) {
				System.out.println(e);
			} 

			// System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);

		}
		
		return list;
	}

}
