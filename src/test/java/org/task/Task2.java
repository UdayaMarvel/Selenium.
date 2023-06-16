package org.task;

import java.util.LinkedHashMap;
public class Task2 {

	public static void main(String[] args) {
		String s = "career guidance";
		char[] c = s.toCharArray();
		
		LinkedHashMap<Character,Integer> m = new LinkedHashMap<>();
		for(int i=0;i<c.length;i++) {
			int x=1;
		if(m.containsKey(c[i])) {
			x=m.get(c[i])+1;
			m.put(c[i],x);
		}else {
			m.put(c[i], x);
		}
			}
		System.out.println(m);
		
		
	}
}
