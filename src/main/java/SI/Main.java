package SI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Fristpage obj = new Fristpage();
		obj.fristpage();
		System.out.println("Press 1 to enter new details");
		System.out.println("Press 2 to serach for a dog");
		int choice = scan.nextInt();
		InsertData obj1 = new InsertData();
		Getdetails obj2 = new Getdetails();
		switch (choice) {
		case 1: {
			obj1.data();
			break;
		}
		case 2: {
			obj2.getdetails();
			break;
		}
		default: {
			System.out.println("Invalid input");
		}
		}
		scan.close();
	}
}