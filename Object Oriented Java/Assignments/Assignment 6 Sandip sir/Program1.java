package org.utilFunctions;

import java.util.Random;
import java.util.Scanner;
import java.util.function.*;

public class Program1 {
	public static void main(String[] args) {
		Function< String ,Integer> fun = str -> str.length();
			int length = fun.apply("Nikhil");
			
			System.out.println(length);
	}
	
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		Supplier<Integer> s = () -> new Random().nextInt();
		
		for(int i =0;i< 5;i++) {
			int numbers = s.get();
			System.out.println(numbers);
		}
	}
	
	public static void main2(String[] args) {
//		   void accept(T t); 
		Consumer<String> c = str -> System.out.println(str);
		c.accept("Hello Nikhil Smile..");
	}
	
	public static void main1(String[] args) {
		Predicate<Integer> p = number -> number % 2 == 0;

		for(int i = 1;i<= 10 ; i++) {
			int num = new Random().nextInt();
			boolean result  = p.test(num);
			if(result != true) {
				System.out.println("The Number "+ i + " is Odd");
			}
			else {
				System.out.println("The Number "+ i + " is Even");
			}
		}
	}

}
