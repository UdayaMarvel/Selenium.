package org.task;

public class Task4 {

	public static void main(String[] args) {
		int[] a= {2,6,8,5,7,9,1,5,6,2,5,7};
		int c ;
		for(int i =0;i<a.length;i++) {
			c =0;
			for(int j=2;j<a[i]/2;j++) {
				if(a[i]%j==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println(a[i]);
			}

		}
	}
}
