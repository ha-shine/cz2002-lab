package sce.cz2002.shine.htetaung.Shapes;

import java.util.Scanner;

public class Cone extends Shape {
	
	private Circle base;
	private int slant;

	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public int getSlant() {
		return slant;
	}

	public void setSlant(int slant) {
		this.slant = slant;
	}

	@Override
	public double getArea() {
		return base.getArea() * Math.PI * this.slant * base.getRadius();
	}

	@Override
	public void getDimension() {
		Circle c = new Circle();
		c.getDimension();
		this.base = c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter slant : ");
		this.slant = sc.nextInt();
	}

}
