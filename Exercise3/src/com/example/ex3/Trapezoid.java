package com.example.ex3;

public class Trapezoid extends Quadrilateral {

	public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
		super(p1, p2, p3, p4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		double a = mP1.getDistanceFrom(mP2);
		double b = mP4.getDistanceFrom(mP3);
		double h = mP2.getDistanceFrom(mP3);
		
		return ((0.5*(a + b)) * h); 
	}
}