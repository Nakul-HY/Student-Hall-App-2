package university;

import java.util.Scanner;

public class StudentTest {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Student one;
		System.out.println("Enter Name,Room location and onPremises status of the student\n");
		String name=scan.nextLine();
		double roomlocation=scan.nextDouble();
		boolean onpremises=scan.nextBoolean();
		one=new Student(name,roomlocation,onpremises);
		System.out.println(one);
		System.out.println("The Student enters the Hall");
		one.enterHall();
		System.out.println(one);
		System.out.println("A fire safety alarm has been called");
		one.exitHall();
		System.out.println(one);
		
		

	}

}
