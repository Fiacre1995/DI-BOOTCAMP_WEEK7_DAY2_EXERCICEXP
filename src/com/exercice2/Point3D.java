package com.exercice2;

public class Point3D extends Point2D {
	
	//Attributs
	
	private float z = 0;

	
	//Constructeur sans parametre
	
	public Point3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Constructeur avec parametre
	
	public Point3D(float x, float y, float z) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	//CGetters & Setters
	
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	public void setXYZ(float z, float y, float x) {
		this.z = z;
		
	}
	
	public float getXYZ() {
		return z;
	}
	
	//methode toString
	
	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}
	
	

	
	
	
	
	
	

}
