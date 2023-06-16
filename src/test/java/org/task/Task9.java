package org.task;

public class Task9 {

	public static void main(String[] args) {
		String s ="hi all students";
		char[] c = s.toCharArray();
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+c[i];
		}
		String[] S = rev.split(" ");
		for(int j=S.length-1;j>=0;j--) {
		System.out.print(S[j]);
		System.out.print(" ");
		}
	}
}
