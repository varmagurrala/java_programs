package com.pro.theory;

public final class Immu {
	
	final private int i;
	 
	 
	 public Immu(int i) {
		 
		 this.i=i;
	 }
	 
	 
	 public Immu getobj(int j) {
		 
		 
		 if(this.i==j) {
			 return this;
		 }
		 else {
			 
			 Immu im= new Immu(j);
			return im; 
		 }
	 }
	 
	 public static void main(String[] args) {
		Immu im= new Immu(10);
		System.out.println(im);
		System.out.println(im.getobj(10));
		System.out.println(im.getobj(11));
	}
	

}
