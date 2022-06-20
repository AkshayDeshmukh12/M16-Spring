package com.tns.springaw;

public class Heart 
{
	private String nameofAnimal;
	private int noofHeart;
	
	public String getNameofAnimal() {
		return nameofAnimal;
	}

	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}

	public int getNoofHeart() {
		return noofHeart;
	}

	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}

	public void print()
	{
		
	System.out.println("The Heart beat rate is 72bita per min");
	System.out.println("Human Heart");
}
}