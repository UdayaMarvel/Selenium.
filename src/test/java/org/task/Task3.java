package org.task;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Task3 {

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
		Set<Entry<Character, Integer>> unique = m.entrySet();
		for (Entry<Character, Integer> v : unique) {
			if(v.getValue().equals(1)) {
				System.out.println(v.getKey());
			}

		}
	}
}
