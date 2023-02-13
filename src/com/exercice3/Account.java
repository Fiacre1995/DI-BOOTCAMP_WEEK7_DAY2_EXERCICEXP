package com.exercice3;

public class Account {
	
	private int id;
	private String name;
	private char gender;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Account(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public char getGender() {
		return gender;
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
	

}
