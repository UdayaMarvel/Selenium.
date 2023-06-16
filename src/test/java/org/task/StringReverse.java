package org.task;

public class StringReverse {
 public static void main(String[] args) {
	
	 String s = "hai kevin";
	 char[] c = s.toCharArray();
	 String m="";
	 for(int i = c.length-1;i>=0;i--) {
		 m=m+c[i];
	 }
	 System.out.println(m);
	 String[] split = m.split(" ");
	 String x="";
	 for(int j=split.length-1;j>=0;j--) {
		 System.out.println(split[j]);
		 x=x+split[j];
	 }
	 System.out.println(x);
	 char[] charArray = x.toCharArray();
	 for(int k =x.length()-1;k>=0;k--) {
		 System.out.println(charArray[k]);
	 }
}
}
