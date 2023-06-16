package org.task;

import java.util.HashMap;

public class Task5 {

	public static void main(String[] args) {
		int[] a= {2,6,8,5,7,9,1,5,6,2,5,7};
		HashMap<Integer,Integer> m = new HashMap<>();
		int x=0;
		for(int i=0;i<a.length;i++) {
			m.put(a[i], x);
		}
		System.out.println(m.keySet());
		System.out.println(m);
	}
}
