package Model;

import java.sql.*;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.PreparedStatement;

public class Student {
	private String fName;
	private String lName;
	private String email;
	private String pNum;
	
	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getEmail() {
		return email;
	}

	public String getpNum() {
		return pNum;
	}

	public Student(String fName, String lName, String email, String pNum) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pNum = pNum;
	}
}
	
	
	


