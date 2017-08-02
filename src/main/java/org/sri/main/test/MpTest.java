package org.sri.main.test;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;

public class MpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<String, String>();
		
		map.put("a", "b");
		map.put(null, null);
		
		System.out.println(map);
		
		Hashtable<String, String> mp = new Hashtable<String, String>();
		
		mp.put("a", "b");
		mp.put(null, null);
		
		System.out.println(mp);
		
		
		Properties pr = new Properties();
		
		pr.put(true, "sri");
	}

}
