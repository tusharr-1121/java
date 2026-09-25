package com.app.fruits;

import java.util.Scanner;

abstract class Fruit
{
	protected String color;
	protected double weight;
	protected String name;
	protected boolean isFresh;
	
	public Fruit() {}
	
	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	
	public abstract String taste();
	
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		
		this.isFresh = isFresh;
	}

	public void acceptData()
	{
		System.out.println("Enter the color :");
		Scanner sc = new Scanner(System.in);
		this.color = sc.nextLine();
		
		System.out.println("Enter the weight :");
		this.weight = sc.nextDouble();
		
		System.out.println("Enter the name :");
		this.name = sc.nextLine();
//		System.out.println("Enter is Fresh or Not :");
//		this.isFresh = sc.nextBoolean();
	}
	
	   @Override
	    public String toString() {
	        return "Name: " + name +
	               ", Color: " + color +
	               ", Weight: " + weight;
	    }
	
	
}