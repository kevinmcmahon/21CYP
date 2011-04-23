package com.example.ex3;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public abstract class Quadrilateral {

	Point mP1, mP2, mP3, mP4;

	public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
		mP1 = p1;
		mP2 = p2;
		mP3 = p3;
		mP4 = p4;
	}
	
	abstract double getArea();
}