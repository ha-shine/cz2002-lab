package sce.cz2002.shine.htetaung.Shapes;

import java.util.Scanner;

public class Rectangle extends Shape {

	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}

	@Override
	public void getDimension() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		this.length = sc.nextInt();
		System.out.print("Enter breadth : ");
		this.breadth = sc.nextInt();
	}

}
