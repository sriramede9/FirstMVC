import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddempController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		// int id=(int) req.getAttribute("id");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		// resp.getWriter().println("<html><body><h1>How you
		// doing?</h1></body></html>"); to test if web.xml is configured

		String name = (String) req.getParameter("name");
		String dob = (String) req.getParameter("dob");
		String dept = (String) req.getParameter("dept");

		System.out.println(name + dob + dept); // testing values
		
		TestModel tModel=new TestModel();

		

	//	 tModel.setupConnection();//db connection

	 tModel.addEmployeeTmodel(name, dob, dept);// added to db

		// add employee

		// List<Employee> employees=tModel.getEmployeListTMOdel();
				// resp.sendRedirect("/AddEmployee.jsp");
	}

}
