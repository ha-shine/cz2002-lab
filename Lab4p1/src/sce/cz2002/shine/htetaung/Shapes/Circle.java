package sce.cz2002.shine.htetaung.Shapes;

import java.util.Scanner;

public class Circle extends Shape {
	
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public void getDimension() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius : ");
		this.radius = sc.nextInt();
	}

}
