package sce.cz2002.shine.htetaung.Shapes;

import java.util.Scanner;

public class Cylinder extends Shape {

	private Circle base;
	private int height;
	
	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return (this.base.getArea() * 2) + ( base.getRadius() * this.height * Math.PI * 2 );
	}

	@Override
	public void getDimension() {
		Circle c = new Circle();
		c.getDimension();
		this.base = c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter height : ");
		this.height = sc.nextInt();
	}

}
