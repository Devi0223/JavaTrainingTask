package com.Inheritance;

public class staticinnerclass {
	static int i = 10;

	public void method() {
		System.out.println("i == " + ++i);
	}

	static class InnerClass {
		public void display() {
			System.out.println("i == " + i);
		}
	}

	public static void main(String[] a) {
		staticinnerclass.InnerClass ic = new staticinnerclass.InnerClass();
		ic.display();

		staticinnerclass oc = new staticinnerclass();
		oc.method();
	}

}
