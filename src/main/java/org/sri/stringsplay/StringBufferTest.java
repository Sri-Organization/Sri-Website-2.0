package org.sri.stringsplay;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s1 = new StringBuffer(2);
		//s1.replace(start, end, str)
		s1.append("This is how we do it");
		
		s1.delete(4, 7);
		s1.deleteCharAt(2);
		
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		s1.append("Hii");
		
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		
		//System.out.println(s1.capacity());

	}

}
