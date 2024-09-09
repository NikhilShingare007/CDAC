package org.Assignment3_1;

import java.util.Scanner;

class LAC {
	private double loan_amount;
	private double interest_rate;
	private double years;
	
	
	void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Loan Amount ");
		this.loan_amount = sc.nextFloat();
		System.out.println("Enter Interest Rate ");
		this.interest_rate = sc.nextFloat();
		System.out.println("Enter Years ");
		this.years = sc.nextFloat();
	}
	
	void printRecord() {
			double months = years * 12;
			double mir = this.interest_rate / 12 / 100; 
			double monthlyPayment = loan_amount * (mir * Math.pow(1 + mir ,months)) / ( Math.pow(1 + mir ,months) - 1) ;
			
			System.out.println("The Monthly Payment is : "+monthlyPayment);
			
			double Total = months *monthlyPayment;
			
			System.out.println("The Total Amountr is : "+Total);

	}
	
}

public class Loan {

	public static void main(String[] args) {
		
		LAC loan = new LAC();
		
		loan.acceptRecord();
		
		loan.printRecord();
		

	}

}
