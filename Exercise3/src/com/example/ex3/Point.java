package com.example.ex3;

public class Point {

	private int mX;
	private int mY;
	
	public Point(int x, int y) {
		mX = x;
		mY = y;
	}
	
	public int getX() {
		return mX;
	}

	public int getY() {
		return mY;
	}

	public double getDistanceFrom(Point targetPoint) {
		return Math.sqrt((targetPoint.getX() - mX)^2 
				+ (targetPoint.getY() - mY)^2);
	}
}