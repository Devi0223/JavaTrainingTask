package com.Inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Ram");
		list.add("100");
		list.add("Devi");
		list.add("somesh");
		
		System.out.println(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map map = new HashMap();
		map.put(1,"Apple");
		map.put(2, "Mango");
		map.put(0, "Orange");
		map.put(3, "Orange");
		System.out.println(map);
		
		Collection c = map.values();
		Iterator ii = c.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
	}

}
