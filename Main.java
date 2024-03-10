package com.guvi.task3;

public class Main {

	    public static void main(String[] args) {
	        // Create employee object
	        Employee emp = new Employee(101, "John Doe", 50000);

	        // Create product object
	        Product p = new Product(101,10.3,5);

	        // Print employee and product tax information
	        System.out.println("Employee Income Tax: $" + emp.calcTax());
	        System.out.println("Product Sales Tax: $" + p.calcTax());
	    }
	}

/*
Employee Income Tax: $5250.0
Product Sales Tax: $3.6050000000000004
*/