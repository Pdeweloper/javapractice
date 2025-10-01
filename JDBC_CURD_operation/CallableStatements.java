package CURD_operation;

import java.sql.*;
public class CallableStatements {
	
	static Connection conn;
	static CallableStatement cst;
	
	static void connect() throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva_concept","root","Prabhas@29#1");
	}
	
	//ye insert karne ka function he using CallableStatment.
	static void insertcourse(int cid,String cname) throws SQLException
	{
		cst = conn.prepareCall("{call InsertCourse(?,?)}");
		cst.setInt(1, cid);
		cst.setString(2, cname);
		
		int x = cst.executeUpdate();
		if(x!=0)
		{
			System.out.println("Inserted Successfuly...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}
	
	//ye select karne ka function he using CallableStatment.
	static void getall() throws SQLException
	{
		cst = conn.prepareCall("{call GetAll()}");
		
		ResultSet rs = cst.executeQuery();
		while(rs.next())
		{
			System.out.println("id:"+rs.getString(1)+" Course:"+rs.getString(2));
		}
	}
	
	//ye Update karne ka function he using CallableStatment.
	static void updatecourse(int cid,String cname) throws SQLException
	{
		cst = conn.prepareCall("{call UpdateCourse(?,?)}");
		cst.setInt(1,cid);
		cst.setString(2,cname);
		
		int x = cst.executeUpdate();
		if(x!=0)
		{
			System.out.println("Updated Successfuly...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}
	
	static void deletecourse(int cid) throws SQLException
	{
		cst = conn.prepareCall("{call DeleteCourse(?)}");
		cst.setInt(1, cid);
		
		int x = cst.executeUpdate();
		if(x!=0)
		{
			System.out.println("Updated Successfuly...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}

	public static void main(String[] args) throws SQLException {
		CallableStatements.connect();
//		CallableStatements.insertcourse(10, "Azure-by-Callable");
		CallableStatements.updatecourse(10, "AZURE-update-by-Callable");
//		CallableStatements.deletecourse(10);
		CallableStatements.getall();
	}

}
