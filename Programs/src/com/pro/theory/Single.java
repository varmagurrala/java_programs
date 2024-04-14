package com.pro.theory;

public class Single {
	
	
	private static Single immu= null;
	
	private Single() {
		
	}
	
	public synchronized static Single getObj() {
		
		if(immu==null) {
			immu=new Single();
		}
		return immu;

	}

	public static void main(String[] args) {
		
		System.out.println(getObj());
		System.out.println(getObj());
	}

}
