package chungcu.ui;

import java.util.List;

import chungcu.entities.Citizen;
import chungcu.managerment.HumanManage;
import chungcu.repository.impl.HumanRepoImpl;

public class Test {

	public static void main(String[] args) {

		Citizen c1 = new Citizen();
		c1.setAddress("AU1202");
		c1.setBirthplace("Phan Thiết");
		c1.setDob(12, 9, 2001);
		c1.setFullName("Nguyễn Mạnh Tiến");
		c1.setHoh(true);
		c1.setId("AU120201");
		c1.setLicense("01010101");
		c1.setNationality("Việt Nam");
		c1.setSex("Nam");

		System.out.println(c1);

		System.out.println("********************");
//
//		String url = "jdbc:sqlserver://ZTRAP;databaseName=Test";
//		String user = "sa";
//		String password = "Ztrap1804";
//		try {
//			Connection c = DriverManager.getConnection(url, user, password);
//
//			String sql = "INSERT INTO students (name, mark)" + " VALUES ('KHANH', 10)";
//			Statement statement = c.createStatement();
//			int rows = statement.executeUpdate(sql);
//
//			if (rows > 0) {
//				System.out.println("Row has been inserted");
//
//			}
//			c.close();
//			System.out.println("Connected");
//		} catch (SQLException e) {
//			System.out.println("Oops, There's an error");
//			e.printStackTrace();
//		}

		System.out.println("********************");
		HumanManage<Citizen> Cizen = new HumanManage<Citizen>(new HumanRepoImpl<Citizen>());

		Citizen c2 = new Citizen();
		c2.setAddress("C2202");
		c2.setBirthplace("Đắk Nông");
		c2.setDob(27, 2, 2001);
		c2.setFullName("Phan Văn Thắng");
		c2.setHoh(true);
		c2.setId("C220201");
		c2.setLicense("158236");
		c2.setNationality("Việt Nam");
		c2.setSex("Nam");
		// Thêm
		Cizen.add(c2);
		// Hiện
		List<Citizen> lstCitizens = Cizen.getAll();
		for (Citizen ci : lstCitizens) {
			System.out.println(ci);

		}

	}

}
