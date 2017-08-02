package org.sri.main.test;

import org.sri.util.Bar;

public class ExceptionTest {
	
	static void throwOne() throws Throwable {
		System.out.println("Inside throwOne.");
		
		Exception e = new IllegalAccessException("demo");
		e.initCause(new ArithmeticException());	
		e.initCause(new ArrayIndexOutOfBoundsException());
		throw e;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			System.out.println("Caught " + e);
		} catch (Throwable e) {
			System.out.println("Caught 2 " + e);
			// TODO Auto-generated catch block
			
		}
		
	}

}
