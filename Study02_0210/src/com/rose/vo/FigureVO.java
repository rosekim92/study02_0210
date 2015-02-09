package com.rose.vo;

public class FigureVO {
	public double figX;
	public double figY;
	public FigureVO(){
		
	}
	public double getFigX() {
		return figX;
	}
	public void setFigX(double figX) {
		this.figX = figX;
	}
	public double getFigY() {
		return figY;
	}
	public void setFigY(double figY) {
		this.figY = figY;
	}
	//넓이구하기
	public double getArea(){
		return figX*figY;
	}
}
