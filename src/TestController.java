
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestController
 */
@WebServlet("/TestController")
public class TestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get the request dispatcher and append to jsp file then forward the req and
		// response

		// get our String

		String date = TestModel.getData();

		// System.out.println(date);

		request.setAttribute("datee", date);

		// test jdbc

		TestModel tModel = new TestModel();

		tModel.setupConnection();

		List<Employee> emplist = tModel.getEmployeListTMOdel();

		//System.out.println("this is our emp list" + emplist);

		request.setAttribute("elist", emplist);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/test.jsp");
		
	

		requestDispatcher.forward(request, response);
		
		String string =request.getParameter("1");
		//int w=Integer.parseInt(string);
			
			System.out.println("tag clicked id is"+string);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}	
