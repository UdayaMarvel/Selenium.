package org.task;

public class Task7 {
	public static void main(String[] args) {
		int[] a= {2,6,8,5,7,9,1,5,6,2,5,7};
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		
	}

}
