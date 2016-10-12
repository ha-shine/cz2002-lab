package sce.cz2002.shine.htetaung.Shapes;

public class Cuboid extends Rectangle {

	@Override
	public double getArea() {
		return (super.getArea() * 4) + (this.getBreadth() * this.getBreadth() * 2);
	}
	
}
