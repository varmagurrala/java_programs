package com.pro.functional;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunIntEx  {

	public static void main(String[] args) {

//		input&output
		Function<String, String> fun = (s)-> s+" gurrala" ;
		System.out.println(fun.apply("varma"));
		
//		input
		Predicate<String> pre= (s)->s.equals("varma");
		System.out.println(pre.test("karma"));
		
//		input
		Consumer<String> con =(s)->System.out.println(s.length());
		con.accept("ravana");
		
//		output
		Supplier<String> sup = ()->"rebal";
		System.out.println(sup.get());
		
//		2input&1output
		BiFunction<String, String, Integer> bif=(s1,s2)->{return s1.length()+s2.length();};
		System.out.println(bif.apply("varma", "gurrala"));
		
//		2inputs
		BiPredicate<String, String> bip= (s1,s2)->{return s1.equals(s2); };
		System.out.println(bip.test("varma", "varma"));
		
		Runnable rrr= ()->{for(int i=0;i<10;i++) {
			System.out.println("run");
		}};
		rrr.run();
		
		

		
		
		
		
	}

}
