package com.Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
	//Integer is Lowerbound
		public static void addNumToList(List<? super Integer> list)
		{
			for(int i=0;i<10;i++)
			{
				list.add(i);
			}
			System.out.println(list);
		}
		
		//Number is the Upperbound
		public static void sumallNum(List<? extends Number> list)
		{
			double d =0;
			for(Number n :list)
			{
				d=d+n.doubleValue();
			}
			System.out.println(d);
		}
		
		
		public static void main(String[] args)
		{
			List<Object> l1 = new ArrayList<Object>();
			addNumToList(l1);
			List<Number> l2 = new ArrayList<Number>();
			addNumToList(l2);


			List<Integer> a = Arrays.asList(1,2,3);
			sumallNum(a);
			
			List<Double> b = Arrays.asList(1.1,2.1,3.1);
			sumallNum(b);

		}
}
