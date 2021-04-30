package anotherTypeOfEmployee;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super (eName, eAddress, ePhone);
		
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	
	public double pay()
	{
		return payRate;
	}
}