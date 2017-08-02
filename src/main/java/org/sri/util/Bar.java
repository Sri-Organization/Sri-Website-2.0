package org.sri.util;

public class Bar {
	
	synchronized void bar(Foo a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered Bar.bar");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("B Interrupted");
		}
		System.out.println(name + " trying to call Foo.last()");
		a.foo(new Bar());
	}

	/*synchronized void last() {
		System.out.println("Inside Bar.last");
	}*/
}
