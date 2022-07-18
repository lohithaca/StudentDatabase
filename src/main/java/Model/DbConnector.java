package Model;

import java.sql.*;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.PreparedStatement;


public class DbConnector {
	public void StudentDbConnector(Student student) throws ClassNotFoundException
	{
		/*String fName = student.getfName();
		String lName = student.getlName();
		String email = student.getEmail();
		String pNum = student.getpNum();
		*/
		String studentData = ("'"+student.getfName()+"','"+student.getlName()+"','"+student.getEmail()+"','"+student.getpNum()+"'");
		
		System.out.println(studentData);
		
		Class.forName("com.mysql.jdbc.Driver");
	
		String url = "jdbc:mysql://localhost:3306/studentreister";
        String uName = "root";
        String pW = "";
        
	try{
        Connection con = DriverManager.getConnection(url,uName,pW);
        System.out.println("Connection is created successfully:");
        
        Statement st = (Statement) con.createStatement();
        
        String query ="INSERT INTO `student` ( `fName`, `lName`, `email`, `pNum`) VALUES ("+studentData+")";
        
        ((java.sql.Statement) st).executeUpdate(query);
        System.out.println("Record is inserted in the table successfully..................");
       
    	}
    catch (Exception e){
        System.out.println(e.toString());
    	}
   }

}
