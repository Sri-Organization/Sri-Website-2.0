package org.sri.main.test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    String thisLine = null;
    //Set removes the duplicates from the list
    HashSet<String> set = new HashSet<String>();
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while ((thisLine = br.readLine()) != null) {
            set.add(thisLine);
         }
         
    Iterator it = set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    System.out.println("Hi");
    }
    
}