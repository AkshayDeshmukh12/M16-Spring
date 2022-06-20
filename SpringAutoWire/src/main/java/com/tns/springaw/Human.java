package com.tns.springaw;

public class Human 
{
	
	private Heart h;
	
	public Human(Heart h) {
		super();
		this.h = h;
	}

	public void setH(Heart h) {
		this.h = h;
	}

	public void display()
	{
		h.print();
		System.out.println("The name of Animal is:"+h.getNameofAnimal()+" and no of Heart is:"+h.getNoofHeart());
	}
}
