package SI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Getdetails {
	int getdetails() {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/si", "root", "Khanna5301");
			System.out.println();
			System.out.println("Enter the unique id of dog: ");
			int id = scan.nextInt();
			System.out.println();
			PreparedStatement stmt = con.prepareStatement("select * from Dog where unique_id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("Details are: ");
				int EId = rs.getInt(1);
				String EName = rs.getString(2);
				String location = rs.getString(3);
				String EPhone = rs.getString(4);
				String city = rs.getString(5);
				int pincode = rs.getInt(6);
				String state = rs.getString(7);
				String colour = rs.getString(8);
				String breed = rs.getString(9);
				System.out.println("ID: " + EId);
				System.out.println("Name of the Person who entered Dog info: " + EName);
				System.out.println("Location: " + location);
				System.out.println("Mobile No of the Person: " + EPhone);
				System.out.println("City: " + city);
				System.out.println("Pincode: " + pincode);
				System.out.println("state: " + state);
				System.out.println("Dog Colour: " + colour);
				System.out.println("Dog Breed: " + breed);
				i++;
			}
			if (i == 0) {
				System.out.println("Details Not Found... ");
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		return i;
	}
}
