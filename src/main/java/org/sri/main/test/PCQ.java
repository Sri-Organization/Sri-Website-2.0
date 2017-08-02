package org.sri.main.test;

import org.sri.util.Consumer;
import org.sri.util.Producer;
import org.sri.util.Q;

public class PCQ {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}

}
