package org.Assignment_4;

import java.util.Scanner;

class toll {
	private int cars = 0;
	private int trucks = 0;
	private int motorcycles = 0;
	private int count;
	private int total;
	
	void setcars(int cars) {
		this.cars = cars;
	}
	
	void settrucks(int trucks) {
		this.trucks = trucks;
	}
	
	void setmotorcycles(int motorcycles) {
		this.motorcycles = motorcycles;
	}
	void countAll() {
		this.count = this.cars + this.trucks + this.motorcycles;
		
	}
	void totalAll() {
		
		 int carToll = this.cars * 50;
	     int truckToll = this.trucks * 100;
	     int motorcycleToll = this.motorcycles * 30;

	     this.total = carToll + truckToll + motorcycleToll;
	}
	
	
	int  getcountAll() {
		return this.count;
	}
	
	int  gettotalAll() {
		return this.total;
	}
}
public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		toll all = new toll();
		
		System.out.println("Enter How Many cars are Going = ");
		all.setcars(sc.nextInt());
		System.out.println("Enter How Many Trucks are Going = ");
		all.settrucks(sc.nextInt());
		System.out.println("Enter How Many Motorcycles are Going = ");
		all.setmotorcycles(sc.nextInt());
		
		all.countAll();
		all.totalAll();
		
		System.out.println("The Count of Vehicles is "+ all.getcountAll());
		System.out.println("The Total Toll amount is "+ all.gettotalAll());
		
		sc.close();
		
		
	}

}
