package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectCommand {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","MH432019!");
		Statement stmt = con.createStatement();
		String s = "Select * from seleniumuser";
		ResultSet rs = stmt.executeQuery(s);
		System.out.println("firstname"+"   "+"email");
		while(rs.next()) {
		String FirstName = rs.getString("firstname");
		String mail = rs.getString("email");
		System.out.println(FirstName+"   "+mail);
		}
		con.close();
		System.out.println("Query executed & db connection closed");

	}

}
