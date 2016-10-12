package sce.cz2002.shine.htetaung.Shapes;

import java.util.Scanner;

public class Shape3DApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many shapes you want to add : ");
		int size = sc.nextInt();
		Shape[] shapes = new Shape[size];
		for(int i = 0; i < size; i++) {
			System.out.print("Enter shape no. " + (i+1) + " (1 Pyramid), (2 Sphere), (3 Cuboid) : ");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				Pyramid tri = new Pyramid();
				tri.getDimension();
				shapes[i] = tri;
				break;
			case 2:
				Sphere cir = new Sphere();
				cir.getDimension();
				shapes[i] = cir;
				break;
			case 3:
				Cuboid rec = new Cuboid();
				rec.getDimension();
				shapes[i] = rec;
				break;
			default:
				break;
			}
		}
		double result = 0;
		for(Shape s : shapes) {
			result += s.getArea();
		}
		System.out.println("Total Area : " + result);
	}
}
