package org.Assignment3_1;

import java.util.Scanner;

class offer {
	private int Original;
	private double discount;
	
	
	void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Original Price  ");
		this.Original = sc.nextInt();
		System.out.println("Enter The Discount Amount  ");
		this.discount = sc.nextFloat();
	}
	
	void printRecord() {
		
		double discountAll = this.Original * this.discount /100;
		
		double Ap = this.Original - discountAll;
		
		System.out.println("Discounted Amount is ₹ "+ discountAll);
		
		System.out.println("The Discoutn Price is ₹ " + Ap);
	}
}

public class Discount {

	public static void main(String[] args) {
		offer price = new offer();
		
		price.acceptRecord();
		
		price.printRecord();
	}

}
