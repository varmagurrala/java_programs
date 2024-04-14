package com.pro.arrays;

public class FindCharInAnArray {

	public static void main(String[] args) {



		approach1("varma", 'a');
		approach2("varma", 'a');	}

	private static void approach2(String s, char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)==c) {
				count++;
				break;

			}
		}

		System.out.println(count);
	}

	private static void approach1(String s, char c) {

		boolean b= false;
		for(int i=0;i<s.length();i++) {

			if(s.charAt(i)==c) {
				

			}

			
		}

	}}
