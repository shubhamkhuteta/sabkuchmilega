package Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.*;


public class CreateTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ResultSet rset;
		ResultSet query = null;
		String sqlString;
		String college_5 = null;
		System.out.println("Enter table name : ");
		Scanner sc=new Scanner(System.in);
		college_5=sc.nextLine();
		// First Step //
		//loading the driver class --> Oracle Class available in --> oracle.jdbc.driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// Second Step //
		// Create the connection --> Driver Manager
		
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abc", "abc123");
		
		// Third Step //
		//Creating Statement
		Statement st=conn.createStatement();
		
		// Fourth Step //
		boolean b=st.execute("create table " +college_5+" (id number(10), name varchar2(20) )");
		int Record_inserted=st.executeUpdate("insert into " +college_5+ " values(03,'Sanskar')");
		query=st.executeQuery("select * from "+college_5);
		while(query.next()) {
			System.out.println("ID : "+query.getInt(1)+"\nName : "+query.getString(2));
			
			
		}
		
		
		//.executeQ
		//System.out.println("Records are :"+i);
		//System.out.println("Total records inserted : "+Record_inserted);
		// Fifth Step //
		conn.close();
		
	//	System.out.println("Table Created :"+b);
	}
}
