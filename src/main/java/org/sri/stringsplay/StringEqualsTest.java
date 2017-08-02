package org.sri.stringsplay;

public class StringEqualsTest {
	
	static String arr[] = {
			"Now", "is", "the", "time", "for", "all", "good", "men",
			"to", "come", "to", "the", "aid", "of", "their", "country"
			};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="Hello";
		
		String s2 ="Hallo";
		
		/*System.out.println(s1.equals(s2));
		System.out.println(s1==s2);*/
		
		System.out.println(s1.compareTo(s2));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j]) >=0) {
					String t = arr[i];
					arr[i]=arr[j];
					arr[j] = t;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array "+arr[i]);
		}
		
		

	}

}
