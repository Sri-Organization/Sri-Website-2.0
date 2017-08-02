package org.sri.main.test;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		
		TreeSet<String> ts = new TreeSet<String>();
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		//ts.subSet(fromElement, fromInclusive, toElement, toInclusive)
		System.out.println(ts);

	}

}
