package com.pro.general;

public class PrimeNumber {
	
	public static void main(String[] args) {
	      boolean flag;
	      for(int i = 2; i<=100;i++){
	          flag = false;
	          for(int j = 2; j<=i/2;j++){
	              if(i % j==0){
	                  flag = true;
	                  break;
	              }
	          }
	          if(!flag){
	              System.out.print(i+",");
	          }
	          
	          
	          
	      }
	     
	    
	     
	      }

}
