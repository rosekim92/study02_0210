package com.rose.vo;

public class CircleInfoVO extends FigureVO{
	
	public double cirX;
	public double cirY;

	public double getCirX() {
		return cirX;
	}

	public void setCirX(double cirX) {
		this.cirX = cirX;
	}

	public double getCirY() {
		return cirY;
	}

	public void setCirY(double cirY) {
		this.cirY = cirY;
	}

	public double getArea(){
		return cirX*cirY*3.14;
	}
}
