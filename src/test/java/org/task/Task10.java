package org.task;

public class Task10 {
	public static void main(String[] args) {
		String s ="hi all students";
		String[] split = s.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]);
			System.out.print(" ");
		}
	}

}
