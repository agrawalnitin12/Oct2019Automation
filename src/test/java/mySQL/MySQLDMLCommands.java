package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","MH432019!");
		Statement stmt = con.createStatement();
		//String s = "INSERT into seleniumuser values('deep','abc@gmail.com')";
		//String s = "update seleniumuser Set firstname = 'rama' where email = 'abc@gmail.com'";
		String s = "delete from seleniumuser where email='abc@gmail.com'";
		
		stmt.execute(s);
		con.close();
		System.out.println("Query executed & db connection closed");
		
	}

}
