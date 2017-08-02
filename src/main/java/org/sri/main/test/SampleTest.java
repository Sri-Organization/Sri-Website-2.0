package org.sri.main.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleTest {

	public static void main(String[] args) {
		
		
		ArrayList<String> arr = new ArrayList<String>(2);
		
		arr.add("1");
		arr.add("2");
		arr.add("3");
		arr.add("4");
		
				
		System.out.println("arr "+arr);
		
		String[] str = {"1","2","3"};
		
		List<String> strList = Arrays.asList(str);
		
		System.out.println("strList "+strList);
		
		int i = Arrays.binarySearch(str, "2");
		
		System.out.println("i "+i);
		
		Arrays.fill(str, "Sri");
		
		 strList = Arrays.asList(str);
		
		System.out.println("strList "+strList);

	}

}
