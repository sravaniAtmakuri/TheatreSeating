package com.demo.data;

import java.util.ArrayList;

public class Allocation {
	
	public static ArrayList<String> rows=new ArrayList<String>(); 
	public static ArrayList<Integer> tickets=new ArrayList<Integer>();
	
	public static void myList() {
		 
		  rows.add("Row 1 Section 1");
		  rows.add("Row 1 Section 2");  
		  
		  rows.add("Row 2 Section 1");  
		  rows.add("Row 2 Section 2");
		  rows.add("Row 2 Section 3");
		  rows.add("Row 2 Section 4");
		  
		  rows.add("Row 3 Section 1");  
		  rows.add("Row 3 Section 2");
		  rows.add("Row 3 Section 3");
		  rows.add("Row 3 Section 4");
		  
		  rows.add("Row 4 Section 1");  
		  rows.add("Row 4 Section 2");
		  rows.add("Row 4 Section 3");
		  rows.add("Row 4 Section 4");
		  
		  rows.add("Row 5 Section 1");
		  rows.add("Row 5 Section 2");
		    
		  tickets.add(6);
		  tickets.add(6);
		  
		  tickets.add(3);
		  tickets.add(5);
		  tickets.add(5);
		  tickets.add(3);
		  
		  tickets.add(4);
		  tickets.add(6);
		  tickets.add(6);
		  tickets.add(4);
		  
		  tickets.add(2);
		  tickets.add(8);
		  tickets.add(8);
		  tickets.add(2);
		  
		  tickets.add(6);
		  tickets.add(6);
		  
	}
	
	public void getSeats(String name, int count) {
		
		int i=0;
		if(count>8 && count<80) {
			System.out.println(name+" Call to split party");
		}
		else if(count>80) {
			System.out.println(name+" Sorry, we can't handle your party");
		}
		else if(count<3) {
			while(i<tickets.size()) {
				  if(tickets.get(i)>=count) {
					  System.out.println(name+" "+rows.get(i));
					  tickets.set(i,tickets.get(i)-count);
					  break;
				  }
				 i++; 
			  }	
		}
		else if(count>=3) {
			while(i<tickets.size()) {
				  if(tickets.get(i)==count) {
					  System.out.println(name+" "+rows.get(i));
					  tickets.set(i,tickets.get(i)-count);
					  break;
				  }
				 i++; 
			  }
		}
		
		
	}
	
}
