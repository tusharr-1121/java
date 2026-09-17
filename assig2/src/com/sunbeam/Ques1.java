package com.sunbeam;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		

	
		  Invoice invoice = new Invoice("P101","Keyboard",2,500.00);
		  System.out.println("Part Number: " + invoice.getPartNumber());
	        System.out.println("Description: " + invoice.getPartDescription());
	        System.out.println("Quantity: " + invoice.getQuantity());
	        System.out.println("Price Per Item: " + invoice.getPrice());
	        
	        System.out.println("Invoice Amount: " + invoice.invoiceAmount());
	        
	        
	        invoice.setQuantity(-5);
	        invoice.setPrice(-100);

	        System.out.println("\nAfter setting invalid values:");

	        System.out.println("Quantity: " + invoice.getQuantity());
	        System.out.println("Price Per Item: " + invoice.getPrice());
	        System.out.println("Invoice Amount: " + invoice.invoiceAmount());
		

	}

}
