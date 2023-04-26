package EmployeeStrategyDesPatten;

import java.util.ArrayList;
import java.util.List;

public class EmpPayRoll {

	//List of items
	List<Hikedetails> items;
	
	public EmpPayRoll(){
		this.items=new ArrayList<Hikedetails>();
	}
	
	public void addItem(Hikedetails item){
		this.items.add(item);
	}
	
	public int calculateTotal(){
		int sum = 0;
		for(Hikedetails item : items){
			sum += item.getPrice();
		}
		return sum;
	}
	
	public void pay(PayrollInterface payment){
		int amount = calculateTotal();
		payment.pay(amount);
	}
}
