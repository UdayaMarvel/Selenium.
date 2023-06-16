package org.task;

public class Task1 {
	public static void main(String[] args) {
		String s = "career guidance";
		char[] c = s.toCharArray();
		char[] v = {'a','e','i','o','u'};

		for(int i=0;i<c.length;i++) {
			for(int j=0;j<v.length;j++) {
				if(c[i]==v[j]) {
					System.out.println("vowels present in String are "+c[i]);
				}
			}
		}
	}

}
