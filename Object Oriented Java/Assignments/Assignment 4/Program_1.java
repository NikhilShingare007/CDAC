package org.Assignment_4;

import java.util.Scanner;

class lac {
	private double loan_amount;
	private double ir_rate;
	private int years;

	void setamount(double loan_amount) {
		this.loan_amount = loan_amount;
	}
	
	void setir_rate(double ir_rate) {
		this.ir_rate = ir_rate;
	}
	
	void setyears(int years) {
		this.years = years;
	}
	
	
	
	void loanamount() {
		int months = years * 12;
		double mir = this.ir_rate / 12 / 100; 
		double monthlyPayment = loan_amount * (mir * Math.pow(1 + mir ,months)) / ( Math.pow(1 + mir ,months) - 1) ;
		
		System.out.println("The Monthly Payment is : "+monthlyPayment);
		
		double Total = months *monthlyPayment;
		
		System.out.println("The Total Amountr is : "+Total);
	}

}
public class Program_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		lac loan = new lac();
		System.out.println("Enter Loan Amount = ");
		loan.setamount(sc.nextDouble());
		System.out.println("Enter Interest Rate = ");
		loan.setir_rate(sc.nextDouble());
		System.out.println("Enter Years = ");
		loan.setyears(sc.nextInt());
		
		
		loan.loanamount();
		

	}

}
