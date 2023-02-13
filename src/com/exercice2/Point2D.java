package com.exercice2;

public class Point2D {

	
	//Attributs 
	
	private float x = 0;
	private float y = 0;
	
	//Constructeurs sans parametre
	
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Constructeurs avec parametres

	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//Getters et Setters

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	public float getXY() {
		return x;
	}
	
	public void setXY(float x, float y) {
		this.x = x;
	}
	
	//methode toString


	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	
}
