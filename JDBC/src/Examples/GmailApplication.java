package Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GmailApplication {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abc", "abc123");
		Statement st=conn.createStatement();

		System.out.println("Enter your username : ");
		Scanner choice=new Scanner(System.in);
		String username=choice.nextLine();
		//while(username)
	}
}
