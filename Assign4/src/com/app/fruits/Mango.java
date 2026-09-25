package com.app.fruits;

class Mango extends Fruit
{
	
	
	
	public Mango() {
		
		//
	}

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		
	}

	

	@Override
	public String taste() {
		return "sweet";
	}
}
