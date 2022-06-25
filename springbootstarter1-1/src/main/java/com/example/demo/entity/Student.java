package com.example.demo.entity;

public class Student 
{

	private String Name;
	private int roll_no;
	
	public Student() {
		super();
		System.out.println("C2TC program sponserd by capgemini ");
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public void display()
	{
		System.out.println("M16 Student And B1-3 Students");
	}
	
	
	
}
