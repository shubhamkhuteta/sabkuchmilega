package Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLApplication {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abc", "abc123");
		Statement st=conn.createStatement();

		System.out.println("0. Create my table\n1. Insert your data\n2. Fatch your data\n3. Delete your data4. Update your data");
		Scanner choice=new Scanner(System.in);
		int ch=choice.nextInt();
		if(ch==0) {
			System.out.println("Enter table name : ");
			Scanner tn=new Scanner(System.in);
			String table_name=tn.nextLine();
			boolean b=st.execute("create table " +table_name+" ( +id number(10), name varchar2(20), college varchar2(20), city varchar2(20) )");
		}
	}
}
