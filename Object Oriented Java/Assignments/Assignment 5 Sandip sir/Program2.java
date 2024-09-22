package org.Assignment5;

import java.util.Scanner;

class Logger {
	private String message;
	private static int count = 0;
	
	private Logger() {
		
		this.message = "";
	}
	
//	private static Logger ref;
//	static {
//		ref = new Logger();
//		
//	}
//	public static Logger getref() {
//		
//		return ref;
//	}
	
	private static Logger ref = null;
	public static Logger getref() {
		if(ref == null) {
			ref = new Logger();
		}
		
			return ref;
	}
	
	  void setmessage(Scanner sc) {
	        if (this.message.isEmpty()) {
	            System.out.println("Enter a Message = ");
	            this.message = sc.nextLine();
	        } else {
	            System.out.println("Message already set. You cannot change it.");
	        }
	    }
	    
	    void getmessage() {
	        if (this.message.isEmpty()) {
	            System.out.println("No message has been set.");
	        } else {
	            System.out.println("Message: " + this.message);
	        }
	    }

}

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Logger s1 = Logger.getref();
		Logger s2 = Logger.getref();
			
			s1.setmessage( sc );
			s1.getmessage();
			
			s2.setmessage( sc );
			s2.getmessage();
			
		
	}

}
