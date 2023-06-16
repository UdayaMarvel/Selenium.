package org.task;

public class Task6 {

	public static void main(String[] args) {
		int[] a= {2,6,8,5,7,9,1,5,6,2,5,7};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
				
			}
		}
	
}
}
