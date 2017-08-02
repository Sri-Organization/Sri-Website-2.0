package org.sri.stringsplay;

public class StringCharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My Name is Sriram";
		String str2 = "Hu name is Sani";
		
		
		
		
		char[] ch = new char[100];
		str.getChars(0, 8, ch, 3);
		ch = str.toCharArray();
		//System.out.println(str.regionMatches(true,3, str2, 3, 8));
		
		
		System.out.println(str2.endsWith("Sani"));
		

	}

}
