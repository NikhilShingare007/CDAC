package org.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class First {
		private int num1;
		private int num2;
		
	public First() {
	}
	
	private static Scanner sc =  new Scanner(System.in);
	
	public void  accessRecord() {
		System.out.println("Enter two Numbers ");
		this.num1 = sc.nextInt();
		this.num2 = sc.nextInt();
		
		
	}
	
	public void calculate() throws ArithmeticException , RuntimeException ,InputMismatchException{
		int result = this.num1 /this.num2;
		
		System.out.println("The Result is "+result);
	}
}

public class FirstException {
	public static void main(String[] args) {
		try {	
			First first = new First();	
			first.accessRecord();
			first.calculate();
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		catch(InputMismatchException ex) {
			ex.printStackTrace();
		}
		catch(RuntimeException ex) {
			ex.printStackTrace();
		}
	}
}
