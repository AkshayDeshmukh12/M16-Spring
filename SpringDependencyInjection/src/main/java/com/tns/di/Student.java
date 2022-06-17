package com.tns.di;

public class Student
{
private String Name;
private int id;

/*public void setName(String name) {
	Name = name;
}

public void setID(int id) {
	this.id = id;
}*/

public Student(String name, int id) {
	super();
	Name = name;
	this.id = id;
}

public void Print()
{
	System.out.println("The Student of M16-Batch is "+Name);
	System.out.println("The Student of M16-Batch is "+Name);
}


}
