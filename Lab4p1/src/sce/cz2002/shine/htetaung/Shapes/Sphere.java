package sce.cz2002.shine.htetaung.Shapes;

public class Sphere extends Circle {

	@Override
	public double getArea() {
		return super.getArea() * 4;
	}
}
