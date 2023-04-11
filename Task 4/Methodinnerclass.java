package com.Inheritance;

public class Methodinnerclass {

	int x =10;
	public void OuterMethod()
	{
		int j=90;
		abstract class MinnerClass
		{			
			abstract void minnerMethod();			
		}
			
		class innerclass extends MinnerClass{
			public void minnerMethod()
			{
			System.out.println("Hello ..." + x + j);
			}
		}
		
		innerclass mic = new innerclass();
		mic.minnerMethod();		
		
	}	
	public static void main(String[] a)
	{
		Methodinnerclass moc = new Methodinnerclass();
		moc.OuterMethod();		
	
		//MinnerClass mic = new MinnerClass();
		//mic.minnerMethod();
	}
	
}
