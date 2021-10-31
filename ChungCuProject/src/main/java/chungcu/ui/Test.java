package chungcu.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		/*
		 * Citizen c1 = new Citizen(); c1.setAddress("AU1202");
		 * c1.setBirthplace("Phan Thiết"); c1.setDob(new Date());
		 * c1.setFullName("Nguyễn Mạnh Tiến"); c1.setHoh(true); c1.setId("AU120201");
		 * c1.setLicense("01010101"); c1.setNationality("Việt Nam"); c1.setSex("Nam");
		 * 
		 * System.out.println(c1);
		 */
		System.out.println("********************");

		String url = "jdbc:sqlserver://ZTRAP;databaseName=Test";
		String user = "sa";
		String password = "Ztrap1804";
		try {
			Connection c = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO students (name, mark)" + " VALUES ('KHANH', 10)";
			Statement statement = c.createStatement();
			int rows = statement.executeUpdate(sql);

			if (rows > 0) {
				System.out.println("Row has been inserted");

			}
			c.close();
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Oops, There's an error");
			e.printStackTrace();
		}

	}

}
