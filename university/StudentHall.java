package university;

public class StudentHall {
	private Student studentObjects[];
	private static int i=0;
	
	public StudentHall(int size) {
		studentObjects=new Student[size];
		for(int i=0;i<size;i++)
		{
			studentObjects[i]=null;
		}
	}
	public void registerStudent(String name,double roomLocation,boolean onPremises)
	{	
		Student s=new Student(name,roomLocation,onPremises);
		if(studentObjects[i]==null && i<studentObjects.length)
		{
			studentObjects[i]=s;
			i++;
		}
		
	}
	public void update(String name,boolean onPremises)
	{
		for(Student s: studentObjects)
		{
			if(s.getName().equalsIgnoreCase(name))
				s.setOnPremises(onPremises);
		}
		
	}
	public int studentsInHall()
	{	int count=0;
		for(Student s: studentObjects)
		{
			if(s.getOnPremises()==true)
				count++;
		}	
		return count;
	}
	public int studentsOnFloor(int floor)
	{	int count=0;
		for(Student s: studentObjects)
		{
			if((int)s.getRoomLocation()==floor)
				count++;
		}	
		return count;
	}
	public void closeFloorForCleaning(int floor)
	{
		for(Student s: studentObjects)
		{
			if((int)s.getRoomLocation()==floor)
				s.setRoomLocation(0.0);
		}
	}
	public void changeRoom(String name,double newRoomLocation)
	{
		for(Student s: studentObjects)
		{
			if(s.getName().equalsIgnoreCase(name))
			{	double actualRoomLocation=s.getRoomLocation();
				for(Student s1: studentObjects)
				{
					if(s1.getRoomLocation()==newRoomLocation)
					{
						s.setRoomLocation(actualRoomLocation);
						return;
					}
					else
					{							
						if(s1.getName().equalsIgnoreCase(name))
							s.setRoomLocation(newRoomLocation);
					}					
				}				
			}
		}
	}
	public void fileAlarm()
	{
		for(Student s: studentObjects)
		{
			s.exitHall();		
		}
	}
	public String toString()
	{
		String returnStudentHall="";
		for(Student s: studentObjects)
		{
			returnStudentHall=returnStudentHall.concat(s.toString());
		}
		return returnStudentHall;
	}
	public String toString(int index)
	{	int i=0;
		String returnIndexStudentHall="";
		if(studentObjects.length<=index)
			returnIndexStudentHall="No student found";
		else
		{
		for(Student s: studentObjects)
		{	if(i++==index)
			{
				if(s==null)
				{
					returnIndexStudentHall="No student found";
					break;
				}
				else
				{
					returnIndexStudentHall="The details of the Student at given index "+index+" is\n"+ s.toString();
					break;
				}
			}			
		}
		}
		return returnIndexStudentHall;
	}
}



























