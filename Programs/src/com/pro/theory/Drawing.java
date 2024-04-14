package com.pro.theory;

public class Drawing {
	

	
	
	public Draw shape(String s) {
		
		if(s.equalsIgnoreCase("circle")) {
			
			Draw d = new Circle();
			
			return d;
		}
		else if (s.equalsIgnoreCase("triangle")) {
			Draw d2= new Triangle();
			return d2;
		}
		
	
return null;

	}
	
	public static void main(String[] args) {
		Drawing d  = new Drawing();
		
		Draw g=d.shape("circle");
		g.draw();
		
		
		
	}

}
