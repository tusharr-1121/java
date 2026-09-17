package com.app.geometry;

import java.util.Scanner;

class Pointer2D
{
	int x;
	int y;
	
	public Pointer2D() {
		// TODO Auto-generated constructor stub
	}
	
	public Pointer2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	void getDetails()
	{
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
	}
	
	boolean isEqual(Pointer2D p2)
	{
		return this.x == p2.x && this.y == p2.y;
		
	}
	
	public double caldistance(Pointer2D p2)
	{
		double dist=0;
		if(this.isEqual(p2))
			return dist;
		else
		{
			dist=Math.sqrt(Math.pow(this.x-p2.x, 2)+Math.pow(this.y-p2.y, 2) );
			return dist;
		}
	}
	
	void accept()
	{
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the x cordinate");
		this.x = sc.nextInt();
		
		System.out.println("Enter the y cordinate");
		this.y = sc.nextInt();	
	
	}
	
	
	
}

public class TestPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Pointer2D p1 = new Pointer2D();

		p1.accept();
		p1.getDetails();
		
		Pointer2D p2 = new Pointer2D();
		p2.accept();
		p2.getDetails();
		
		p1.caldistance(p2);
		
	}

}
