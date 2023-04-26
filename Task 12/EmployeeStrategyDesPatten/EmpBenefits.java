package EmployeeStrategyDesPatten;

public class EmpBenefits {

	public static void main(String[] args) {
		EmpPayRoll emp = new EmpPayRoll();
		
		Hikedetails item1 = new Hikedetails("BasicPay",21000);
		Hikedetails item2 = new Hikedetails("HRA",8000);
		Hikedetails item3 = new Hikedetails("TA",10000);
		Hikedetails item4 = new Hikedetails("Bonus",2000);
		
		
		emp.addItem(item1);
		emp.addItem(item2);
		emp.addItem(item3);
		emp.addItem(item4);
		emp.pay(new Salary("1000", "Test Employee One"));
		
		
	}

}
