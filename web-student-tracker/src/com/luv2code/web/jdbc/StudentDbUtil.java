	package com.luv2code.web.jdbc;
	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;
	
	import javax.sql.DataSource;
	
	public class StudentDbUtil {
	 private static  DataSource dataSource;
	 
	 public StudentDbUtil(DataSource theDataSource) {
		 	dataSource = theDataSource;
	 	}
	 
	 public List<Student> getStudents() throws Exception{
		 
		 List<Student> students = new ArrayList<>();
		 
		 	Connection myConn =null;
		 	Statement myStmt = null;
		 	ResultSet myRs = null;
		 	
		 	try {
				// get db connection
	myConn = dataSource.getConnection();
	
	// create sql statement
	String sql = "select * from student order by last_name";
	myStmt = myConn.createStatement();
	
	// execute query
	myRs = myStmt.executeQuery(sql);
	
	//process result set
	while(myRs.next()) {
		// retrieve data from result set row
	int id = myRs.getInt("id");
	String firstName = myRs.getString("first_name");
	String lastName = myRs.getString("last_name");
	String email = myRs.getString("email");
	
	// create new student object
	Student tempStudent = new Student(id, firstName, lastName,email);
	
	// add it to the list of students
	 			students.add(tempStudent);
	 			
	 		}
	 		
	 		return students;
	 } 
	finally {
		// close JDBC object
						close(myConn, myStmt, myRs);
					}
				 
				
				}
	
	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws Exception {
		try {
			if(myRs !=null) {
				myRs.close();
			}
			if(myStmt !=null) {
				myStmt.close();
			}
			if(myConn !=null) {
				myConn.close(); // doesn't really close it ... just puts back in connection pool
			}
		} catch (Exception exc) {
			
			exc.printStackTrace();
		}
		
			}
	
	public static void addStudent(Student theStudent) throws Exception {
		Connection myConn =null;
		PreparedStatement myStmt=null;
		try {
			// get connection
	myConn = dataSource.getConnection();
	// creat sql for insert
	String sql = "insert into student"
	+"(first_name, last_name, email)"
	+"values(?,?,?)";
	myStmt = myConn.prepareStatement(sql);
	
	// set the param value for student
	myStmt.setString(1, theStudent.getFirstName());
	myStmt.setString(2, theStudent.getLastName());
	myStmt.setString(3, theStudent.getEmail());
	
	// execute sql insert
		myStmt.execute();
	} finally {
		// clean up JDBC objects
	close(myConn, myStmt, null); // the last null is for resultSet,
	//but we don't have resultSt
			}
	
		}
	
	public static Student getStudent(String theStudentId) throws Exception {
		Student theStudent =null;
		
		Connection myConn=null;
		PreparedStatement myStmt=null;
		ResultSet myRs =null;
		int studentId;
		try {
			// convert student id to int
	studentId = Integer.parseInt(theStudentId);
	
	// get connection to database
	myConn = dataSource.getConnection();
	
	// create sql to get selected student
	String sql = "select * from student where id=?";
	
	// create prepared statement
	myStmt = myConn.prepareStatement(sql);
	
	// set params
	myStmt.setInt(1, studentId);
	
	// execute statement
	myRs = myStmt.executeQuery();
	
	// retrieve data from result set row
	if(myRs.next()) {
		
		String firstName = myRs.getString("first_name");
	String lastName = myRs.getString("last_name");
	String email = myRs.getString("email");
	
	// use the studentId during constrution
		theStudent = new Student(studentId,firstName,lastName,email);
	}else {
		throw new Exception("Could not find student id: "+studentId);
		}
		
		return theStudent;
	} finally {
		// clean up JDBC objects
			close(myConn, myStmt, myRs);
			
		}
		
		
	}
	
	public static void updateStudent(Student theStudent) throws Exception{
			Connection myConn =null;
			PreparedStatement myStmt=null;
		
			try {
				// get db connetion
	myConn = dataSource.getConnection();
	
	// create SQL update statement
	String sql = "update student "
	+"set first_name=?, last_name=?, email=? "
	+"where id=?";
	
	// prepar statement 
	myStmt = myConn.prepareStatement(sql);
	
	// set params
	myStmt.setString(1, theStudent.getFirstName());
	myStmt.setString(2, theStudent.getLastName());
	myStmt.setString(3, theStudent.getEmail());
	myStmt.setInt(4, theStudent.getId());
	
	// excute SQL statement
		myStmt.execute();
	} finally {
		// clean JDBC object
	close(myConn,myStmt,null); // null means no resultSet
			}
			
		
		}

	public void deleteStudent(String theStudentId) throws Exception{
		
		Connection myConn=null;
		PreparedStatement myStmt=null;
		try {
			
			// convert student id to int
			int studentId = Integer.parseInt(theStudentId);
					
			//get connection to database
			myConn = dataSource.getConnection();
			
			// create SQL delete statement
			String sql ="delete from student where id=?";
			
			// prepar statement
			myStmt = myConn.prepareStatement(sql);
			
			//set params
			myStmt.setInt(1, studentId);
			
			//execute SQL statement
			myStmt.execute();
			
		} finally {
			// clean JDBC object
			close(myConn,myStmt,null); // null means no resultSets
		}
		
		
	}
	}
