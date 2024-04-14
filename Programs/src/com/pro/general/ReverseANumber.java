package com.pro.general;

public class ReverseANumber {

	public static void main(String[] args) {
		int a =1234;
	      int b =0;
	while(a!=0){
	    int temp = a%10;
	    System.out.println(temp);
	    b = temp+10*b;
	    a=a/10;
	}
	
	
	System.out.println(b);
	}

}
