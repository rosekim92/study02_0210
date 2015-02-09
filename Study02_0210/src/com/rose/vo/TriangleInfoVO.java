package com.rose.vo;

public class TriangleInfoVO extends FigureVO{
	public double triX;
	public double triY;
	
	public double getTriX() {
		return triX;
	}

	public void setTriX(double triX) {
		this.triX = triX;
	}

	public double getTriY() {
		return triY;
	}

	public void setTriY(double triY) {
		this.triY = triY;
	}

	public double getArea(){
		return triX*triY*0.5;
	}
}
