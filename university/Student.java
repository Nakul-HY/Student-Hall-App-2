package university;

public class Student {
	private String name;
	private double roomLocation;
	private boolean onPremises;
	//private static int x=1;
	
	public Student(String name,double roomLocation,boolean onPremises) {
		this.name=name;
		this.roomLocation=roomLocation;
		this.onPremises=onPremises;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setRoomLocation(double roomLocation)
	{
		this.roomLocation=roomLocation;
	}
	public double getRoomLocation()
	{
		return this.roomLocation;
	}
	public void setOnPremises(boolean onPremises)
	{
		this.onPremises=onPremises;
	}
	public boolean getOnPremises()
	{
		return this.onPremises;
	}
	public void enterHall()
	{
		this.setOnPremises(true);
	}
	public void exitHall()
	{
		this.setOnPremises(false);
	}
	public String toString()
	{	
		//System.out.println("Student "+ x++);//Can be used to print Student No
		return "Student \nName:\t\t"+this.name+"\nRoom Location:\t"+this.roomLocation+"\nOn Premises:\t"+this.onPremises+"\n";
	}
	
}
