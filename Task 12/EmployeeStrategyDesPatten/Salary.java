package EmployeeStrategyDesPatten;

public class Salary implements PayrollInterface {

	private String employeeId;
	private String employeeName;
	
	public Salary(String employeeId, String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid to Employee - " + employeeName + " whose Employee Id is " + employeeId);
	}

}