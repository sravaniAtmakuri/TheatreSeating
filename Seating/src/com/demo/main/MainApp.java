package com.demo.main;

import java.util.ArrayList;

import com.demo.data.Allocation;

public class MainApp {

	
	
	public static void main(String[] args) {
		
		Allocation aloc = new Allocation();		
		Allocation.myList();
		
		aloc.getSeats("Smith", 2);
		aloc.getSeats("Jones", 5);
		aloc.getSeats("Davis", 6);
		aloc.getSeats("Wilson", 100);
		aloc.getSeats("Jhonson", 3);
		aloc.getSeats("Williams", 4);
		aloc.getSeats("Brown", 8);
		aloc.getSeats("Miller", 12);
		
		

}

}
