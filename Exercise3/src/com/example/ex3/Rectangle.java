package com.example.ex3;

public class Rectangle extends Quadrilateral {

	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		super(p1, p2, p3, p4);
	}
	
	@Override
	public double getArea() {
		return mP1.getDistanceFrom(mP3) * mP1.getDistanceFrom(mP2);
	}
	
}