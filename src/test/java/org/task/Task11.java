package org.task;

import java.util.ArrayList;
import java.util.List;

public class Task11 {

	public static void main(String[] args) {
		String s ="t4es79ti38n9g";
		char[] c = s.toCharArray();
		char[] ch= {'1','2','3','4','5','6','7','8','9'};

		int x=0;
		for(int j=0;j<s.length();j++) {
			if(!Character.isAlphabetic(c[j])) {
				System.out.println(c[j]);
			}
			/*
			 * else { System.out.println(c[j]); } if(x==0) { System.out.println(c[j]); }
			 */
		}
		List l = new ArrayList();
		for(int i=0;i<c.length;i++) {
			l.add(c[i]);
			for(int j=1;j<ch.length;j++) {
				if(l.get(i).equals(ch[j])) {
					//System.out.println(c[i]);

				}
			}
		}
	}
}
