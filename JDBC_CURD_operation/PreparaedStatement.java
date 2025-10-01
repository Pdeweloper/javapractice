package CURD_operation;

import java.sql.*;

public class PreparaedStatement {
	
	static Connection conn;
	static PreparedStatement pst;
	
	static void connect() throws SQLException
	{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shiva_concept","root","Password");
	}
	
	//ye insert karne ka function he using preparedStatement.
	static void insertcourse(int cid,String cname) throws SQLException
	{
		pst = conn.prepareStatement("insert into course values (?,?)");
		pst.setInt(1, cid);
		pst.setString(2, cname);
		
		int x = pst.executeUpdate();
		if(x!=0)
		{
			System.out.println("Inserted Successfuly...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}
	
	//ye update karne ka function he using preparedStatement.
	static void updatecourse(int cid,String cname) throws SQLException
	{
		pst = conn.prepareStatement("update course set course_name=? where course_id=?");
		pst.setString(1, cname);
		pst.setInt(2, cid);
		
		int x = pst.executeUpdate();
		if(x!=0)
		{
			System.out.println("Update Successfuly...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}
	
	//ye select karne ka function he using preparedStatement.
	static void showdata() throws SQLException
	{
		pst = conn.prepareStatement("select * from course");
		
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			System.out.println("c_id:"+rs.getString(1)+" c_name:"+rs.getString(2));
		}
	}
	
	//ye Delete karne ka function he using preparedStatement. 
	static void deletecourse(int cid) throws SQLException
	{
		pst = conn.prepareStatement("delete from course where course_id=?");
		pst.setInt(1, cid);
		
		int x = pst.executeUpdate();
		if(x!=0)
		{
			System.out.println("Deleted Successfuly...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}

	public static void main(String[] args) throws SQLException {
		PreparaedStatement.connect();
//		PreparaedStatement.insertcourse(7, "AWS_by_program");
		PreparaedStatement.updatecourse(7, "AWS-update_by_Prepared");
//		PreparaedStatement.deletecourse(4);
		PreparaedStatement.showdata();

	}

}

