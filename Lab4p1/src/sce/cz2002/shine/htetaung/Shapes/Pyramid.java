package sce.cz2002.shine.htetaung.Shapes;

import java.util.Scanner;

public class Pyramid extends Shape {
	
	private int slant;
	private Rectangle base;

	public int getSlant() {
		return slant;
	}

	public void setSlant(int slant) {
		this.slant = slant;
	}

	public Rectangle getBase() {
		return base;
	}

	public void setBase(Rectangle base) {
		this.base = base;
	}

	@Override
	public double getArea() {
		return this.base.getArea() + (this.slant * (this.base.getLength() + this.base.getBreadth()));
	}

	@Override
	public void getDimension() {
		Rectangle rec = new Rectangle();
		System.out.println("Enter values for base rectangle");
		rec.getDimension();
		this.setBase(rec);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter slant : ");
		this.slant = sc.nextInt();
	}
}
