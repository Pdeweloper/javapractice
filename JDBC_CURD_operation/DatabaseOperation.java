package CURD_operation;

import java.sql.*;

public class DatabaseOperation {
	
	static Connection conn;
	static DriverManager driver;
	static Statement st;
	
	static void connection() throws SQLException
	{
		conn = driver.getConnection("jdbc:mysql://localhost:3306/shiva_concept", "root", "Password");
		st = conn.createStatement();
	}
	
	static void insertStudent(int rno , String sname, int fee) throws SQLException
	{
		int x = st.executeUpdate("insert into student values('"+rno+"','"+sname+"','"+fee+"')");
		if(x!=0)
		{
			System.out.println("Data inserted Successfully...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}
	
	static void upadteStudent(int rno , String sname, int fee) throws SQLException
	{
		int x = st.executeUpdate("update student set name='"+sname+"' where rno ="+rno);
		int y = st.executeUpdate("update student set fee='"+fee+"' where rno ="+rno);
		
		if(x!=0 && y!=0)
		{
			System.out.println("Udated Successfully...");
		}
		else {
			System.out.println("Something went wrong..");
		}
	}
	
	static void deleteStudent(int rno) throws SQLException {
		int x = st.executeUpdate("delete from student where rno="+rno);
		if(x!=0)
		{
			System.out.println("Delete Successfully...");
		}
		else
		{
			System.out.println("Something went Wrong..");
		}
	}
	
	static void select() throws SQLException {
		ResultSet rt = st.executeQuery("select * from student");
		while(rt.next())
		{
			System.out.println("Roll N0.:"+rt.getString(1)+" Name:"+rt.getString(2)+" Fee:"+rt.getString(3));
		}
	}

	public static void main(String[] args) throws SQLException {
		
		DatabaseOperation.connection();
//		DatabaseOperation.insertStudent(106,"Java_Stu7", 8500);
//		DatabaseOperation.upadteStudent(6,"Javanew_stu", 2000);
//		DatabaseOperation.deleteStudent(6);
		DatabaseOperation.select();
		

	}

}

