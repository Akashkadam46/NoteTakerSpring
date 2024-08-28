package com.java.practice;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTablePrac {
	  
	      public static void main(String[] args) {
           Hashtable<Integer, String> hash = new Hashtable<Integer,String>();
           hash.put(1, "Akash");
           hash.put(2, "Vasant");
           hash.put(3, "Kadam");
           
           Enumeration e = hash.elements();
           
           while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
           
          
		}
	      

}
