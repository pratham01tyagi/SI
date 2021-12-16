package SI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	void data() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/si", "root", "Khanna5301");
			String g = "insert into Dog( unique_id, NameofPerson, Location, MobileNo, CITY, PINCODE, STATE, Dogcolour, DogBreed) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ptsmt = con.prepareStatement(g);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println();
			int a = 1, b = 400;
			int unique_id = (int) (Math.random() * (b - a + 1) + a);
			// String S_No = br.readLine();
			System.out.println("Enter your Name:");
			String NameofPerson = br.readLine();
			System.out.println("Enter the loaction:");
			String Location = br.readLine();
			System.out.println("Enter your Mobile Number:");
			String MobileNo = br.readLine();
			System.out.println("Enter City:");
			String CITY = br.readLine();
			System.out.println("Enter Pincode:");
			String PINCODE = br.readLine();
			System.out.println("Enter State:");
			String STATE = br.readLine();
			System.out.println("Enter Dogcolour:");
			String Dogcolour = br.readLine();
			System.out.println("Enter DogBreed:");
			String DogBreed = br.readLine();
			ptsmt.setInt(1, unique_id);
			ptsmt.setString(2, NameofPerson);
			ptsmt.setString(3, Location);
			ptsmt.setString(4, MobileNo);
			ptsmt.setString(5, CITY);
			ptsmt.setInt(6, Integer.parseInt(PINCODE));
			ptsmt.setString(7, STATE);
			ptsmt.setString(8, Dogcolour);
			ptsmt.setString(9, DogBreed);
			ptsmt.executeUpdate();
			System.out.println();
			System.out.println("Inserted Successfully...");
			System.out.println();
			System.out.println("Unique id for the dog is: " + unique_id);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}