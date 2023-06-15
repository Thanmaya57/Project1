package com.ty.onlinePlatform;

import java.util.*;
public class MainClass {
	
	public static void main(String[] args) {
		
		Product p1=new Toys(111,55.00);
		Product p2=new Toys(112,666.00);
		Product p3=new Toys(114,100.00);
		Product p9=new Toys(116,89.00);
		Product p6=new Toys(118,72.00);
		Product p11=new Toys(145,155.00);
		Product p15=new Toys(117,525.00);
		Product p5=new Toys(118,775.00);
		
		Product p4=new Books(121,499.00);
		Product p16=new Books(131,1258.00);
		Product p12=new Books(125,2481.00);
		Product p7=new Books(127,269.00);
		Product p17=new Books(152,356.00);
		
		Product p13=new Cosmetics(311,598.00);
		Product p18=new Cosmetics(301,600.00);
		Product p19=new Cosmetics(306,545.00);
		Product p22=new Cosmetics(302,2000.00);
		
		Product p8=new Electronics(201,5000.00);
		Product p10=new Electronics(205,6999.00);
		Product p14=new Electronics(202,5981.00);
		Product p20=new Electronics(217,2500.00);
		Product p21=new Electronics(215,3000.00);
		
	 
		LinkedHashMap<Integer,Product> map=new LinkedHashMap<Integer,Product>();
		 
		map.put(p1.pid, p1);
		map.put(p2.pid, p2);
		map.put(p3.pid, p3);
		map.put(p4.pid, p4);
		map.put(p5.pid, p5);
		map.put(p6.pid, p6);
		map.put(p7.pid, p7);
		map.put(p8.pid, p8);
		map.put(p9.pid, p9);
		map.put(p10.pid, p10);
		map.put(p11.pid, p11);
		map.put(p12.pid, p12);
		map.put(p13.pid, p13);
		map.put(p14.pid, p14);
		map.put(p15.pid, p15);
		map.put(p16.pid, p16);
		map.put(p17.pid, p17);
		map.put(p18.pid, p18);
		map.put(p19.pid, p19);
		map.put(p20.pid, p20);
		map.put(p21.pid, p21);
		map.put(p22.pid, p22);
		
		
		Set<Integer> key=map.keySet();
		System.out.println("Products in collection before Seggregation");
		System.out.println("<------------------------------------------------------>");
		
	      for(Object keys:key)
	      {
	    	  System.out.println(map.get(keys));
	      }
	      System.out.println("----------------------------------------");
	     
	      TreeSet<Toys> m1=new TreeSet<Toys>();
	      TreeSet<Books> m2=new TreeSet<Books>();
	      TreeSet<Cosmetics> m3=new TreeSet<Cosmetics>();
	      TreeSet<Electronics> m4=new TreeSet<Electronics>();
	      
	      
	 
	      for(Object keys:key)
	      {
	    	  System.out.println(keys);
	    	  Object obj=map.get(keys);
	    	  System.out.println(obj);
	    	  if(obj instanceof Toys)
	    	  {
	    		  Toys t=(Toys)obj;
	    		  m1.add(t);
	    	  }
	    	  if(obj instanceof Books)
	    	  {
	    		  Books b=(Books)obj;
	    		  m2.add(b);
	    	  }
	    	  
	    	  if(obj instanceof Cosmetics)
	    	  {
	    		  Cosmetics c=(Cosmetics)obj;
	    		  m3.add(c);
	    	  }
	    	  
	    	  if(obj instanceof Electronics)
	    	  {
	    		  Electronics e=(Electronics)obj;
	    		  m4.add(e);
	    	  }
	      }
	      
	      System.out.println(m1);
	      System.out.println("Products after seggergation...");
	      
//	      Set<Integer> Toys_key=m1.keySet();
	      System.out.println("Toys collection....");
	      System.out.println("----------------------------------");
	      
	      
	      for(Toys keys:m1)
	      {
	    	  System.out.println(keys);
	      }
	      System.out.println("---------------------------------");
	      
//	      
//	      Set<Integer> Books_key=m2.keySet();
////	      System.out.println("Books collection....");
////	      System.out.println("----------------------------------");
//	      
	      
	      for(Books keys:m2)
	      {
	    	  System.out.println(keys);
	      }
	      System.out.println("---------------------------------");
//	      
//	      Set<Integer> Cosmetics_key=m3.keySet();
	      System.out.println("Cosmetics collection....");
	      System.out.println("----------------------------------");
	      
	      
	      for(Cosmetics keys:m3)
	      {
	    	  System.out.println(keys);
	      }
	      System.out.println("---------------------------------");
	      
//	      
//	      Set<Integer>  Electronics_key=m4.keySet();
	      System.out.println(" Electronics collection....");
	      System.out.println("----------------------------------");      
	      
	      for(Electronics keys: m4)
	      {
	    	  System.out.println(keys);
	      }
	      System.out.println("---------------------------------");
	        
	}

}









