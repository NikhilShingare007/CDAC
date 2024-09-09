package org.Assignment3_1;

import java.util.Scanner;

class investment1 {
	private float principal;  // Amount
	private float annualInterestRate;
	private float numberOfCompounds;
	private int years;
	
	
	void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Investment Amount ");
		this.principal = sc.nextFloat();
		System.out.println("Enter Annual Interest Rate ");
		this.annualInterestRate = sc.nextFloat();
		System.out.println("Enter Compont interest in y ");
		this.numberOfCompounds = sc.nextFloat();
		System.out.println("Enter Years ");
		this.years = sc.nextInt();
	}
	
	void printRecord() {
		
	double	futureValue = principal * Math.pow(1 + annualInterestRate / numberOfCompounds ,numberOfCompounds * years);
	
	double totalInterest = futureValue - principal;
	
	System.out.println("The Total Investment By Customer is "+ futureValue);
	
	
	System.out.println("The Total Interest Got By Customer is "+ totalInterest);
	
	}
	
}

public class Investment {

	public static void main(String[] args) {
		
		investment1 inv = new investment1();
		
		inv.acceptRecord();
		
		inv.printRecord();
		

	}

}
