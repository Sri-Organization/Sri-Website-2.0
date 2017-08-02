package org.sri.stringsplay;

import org.sri.util.Sriram;

public class Stringindexplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str = "abcabcabc";
		
		int i=str.indexOf("b");
		int j = str.substring(str.indexOf("b")+1, str.length()-1).indexOf("b");
		System.out.println((i+j+1));
		str.substring(str.indexOf("b")+1, str.length()-1).indexOf("b");*/
		
		
		/*String s1 = "abcabcabc";
		
		s1 = s1.replaceFirst("abc", "replacement");
		
		System.out.println(s1);*/
		
		
		/*int[] ch = {1 , 2, 3};
		
		Sriram sri  = new Sriram();
		
		System.out.println(String.valueOf(ch));
		System.out.println(ch.toString());*/
		
		String s1 = "srizkhfjzdfgdjfhgz";
		
		String[] s2 = s1.split("z");
		
		System.out.println(s2[0] + s2[1]);
		
		
	}

}
