package org.sri.util;

public class Foo {
	
	synchronized void foo(Bar b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered Foo.foo");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A Interrupted");
		}
		System.out.println(name + " trying to call B.last()");
		b.bar(new Foo());
	}
	
	/*synchronized void last() {
		System.out.println("Inside A.last");
	}*/

}
