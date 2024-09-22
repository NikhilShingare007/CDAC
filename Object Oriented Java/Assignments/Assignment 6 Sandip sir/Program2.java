package org.utilFunctions;

import java.util.function.*;
class Printable {
	
		public static void print(Consumer<String> c, String str) {
			c.accept(str);
		}
		public static void print1(Function<String,Integer> fun, String str) {
			int length = fun.apply(str);
			
			System.out.println("Length of the string: " + length);
		}
		
}


public class Program2 {
	public static void main(String[] args) {
		Printable.print(str -> System.out.println(str),"Hello Nikhil Smile..");
		
		Printable.print1(str ->str.length(),"Nikhil Smile..");
	}
}
