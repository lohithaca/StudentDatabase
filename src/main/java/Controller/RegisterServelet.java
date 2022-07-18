package Controller;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.DbConnector;
import Model.Student;

public class RegisterServelet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res)
	{
		String fName = req.getParameter("fName");
		String lName = req.getParameter("lName");
		String email = req.getParameter("email");
		String pNum = req.getParameter("pNum");
		
		System.out.println("Data Received");
		Student student = new Student(fName,lName,email,pNum);
		DbConnector studentConnector = new DbConnector();
		
		try {
			studentConnector.StudentDbConnector(student);;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
