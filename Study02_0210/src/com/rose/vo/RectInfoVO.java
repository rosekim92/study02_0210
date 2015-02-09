package com.rose.vo;

public class RectInfoVO extends FigureVO{
	public double recX;
	public double recY;
	
	public double getRecX() {
		return recX;
	}

	public void setRecX(double recX) {
		this.recX = recX;
	}

	public double getRecY() {
		return recY;
	}

	public void setRecY(double recY) {
		this.recY = recY;
	}

	public double getArea(){
		return recX*recY;
	}
}
