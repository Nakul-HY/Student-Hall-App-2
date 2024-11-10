package university;

import java.util.Scanner;

public class StudentHallTest {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		StudentHall studenthall;
		String name="";
		double roomlocation;
		boolean onpremises;
		System.out.println("Specify the number of students(size) to be registered in a Student Hall");
		int size=scan.nextInt();
		studenthall=new StudentHall(size);
		
		System.out.println("Populate the StudentHall object with students");
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter Student name, a roomLocation and an onPremises value");
			name=scan.nextLine();
			name=scan.nextLine();
			roomlocation=scan.nextDouble();
			onpremises=scan.nextBoolean();
			studenthall.registerStudent(name, roomlocation, onpremises);
		}
		//studenthall.registerStudent("Akash",2.22, true);//This registration fails since there is No Empty position in an Array
		System.out.println(studenthall);
		
		System.out.println("Enter the student name and a new onPremises value for the student who leaves the Hall\n");
		name=scan.nextLine();
		name=scan.nextLine();
		onpremises=scan.nextBoolean();
		studenthall.update(name,onpremises);
		System.out.println(studenthall);
		
		System.out.println("The Number of students on premises are: "+studenthall.studentsInHall()) ;
		
		System.out.println("Enter the floor number to know the number of students in rooms on that floor");
		int floor=scan.nextInt();
		int studentsonfloor=studenthall.studentsOnFloor(floor);
		System.out.println("The number of students in rooms on "+floor+" floor is "+studentsonfloor);
		
		System.out.println("We are closing No "+floor+" floor for cleaning");
		studenthall.closeFloorForCleaning(floor);
		System.out.println(studenthall);
		
		System.out.println("Enter the student name and a new free unoccupied roomLocation");
		String sname=scan.nextLine();
		sname=scan.nextLine();
		double newroomlocation=scan.nextDouble();
		studenthall.changeRoom(sname, newroomlocation);
		System.out.println(studenthall);
		
		System.out.println("Enter the index value of the studentHall Object to know the details about that particular student");
		int index=scan.nextInt();
		System.out.println(studenthall.toString(index));
		
		System.out.println("A fire safety alarm has been called");
		studenthall.fileAlarm();
		System.out.println(studenthall);		
	}

}
