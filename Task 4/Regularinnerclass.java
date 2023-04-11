package com.Inheritance;
//regular inner class
public class Regularinnerclass {

	int x =7;
	abstract class MyInner
	{
		abstract void InnerMethod();
		/*public void InnerMethod()
		{ 
			int y = 5;
			System.out.println("x == y  " + x + "----"+ y) ;
		}*/
	}
	
	class invinnerclass extends MyInner{
		public void InnerMethod()
		{ 
			int y = 5;
			System.out.println("x == y  " + x + "----"+ y) ;
		}
	}
	public void OuterMethod()
	{
		System.out.println("From outer method = " + x);
		invinnerclass inn = new invinnerclass();
		inn.InnerMethod();
	}
	public static void main(String[] a)
	{
		Regularinnerclass mo = new Regularinnerclass();
		Regularinnerclass.MyInner mi = mo.new invinnerclass(); //instantiate inner class
		mi.InnerMethod();
		mo.OuterMethod();	
	}


}
