package org.sri.main.test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		String thisLine = null;
    //Set removes the duplicates from the list
    HashSet<String> set = new HashSet<String>();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
		while ((thisLine = br.readLine()) != null) {
		        set.add(thisLine);
		     }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
         
    Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }}


