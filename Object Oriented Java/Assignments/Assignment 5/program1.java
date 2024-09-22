package org.Assignment5;

class InstanceCounter {
	private static int count;
	
	InstanceCounter() {
		System.out.println("Instance Count ");
		count++;
	}

	static void Counter() {
		System.out.println("The Count of Instances is "+InstanceCounter.count);
	}
}

public class program1 {
	public static void main(String[] args) {
		InstanceCounter In1 = new InstanceCounter();
		InstanceCounter In2 = new InstanceCounter();
		InstanceCounter In3 = new InstanceCounter();
		
		InstanceCounter.Counter();
		
		
	}

}
