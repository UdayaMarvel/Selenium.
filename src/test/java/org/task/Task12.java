package org.task;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
	public static void main(String[] args) {
		String s ="t4es79ti38n9g";
		char[] c = s.toCharArray();
		char[] ch= {'t','e','s','t','i','n','g'};
		
		List l = new ArrayList();
		for(int i=0;i<c.length;i++) {
		l.add(c[i]);
		for(int j=1;j<ch.length;j++) {
		if(l.get(i).equals(ch[j])) {
			System.out.println(c[i]);
			
		}
		}
		}
}
}
