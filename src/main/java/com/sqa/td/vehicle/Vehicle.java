package com.sqa.td.vehicle;

public class Vehicle
{

	private String color;

	private int wheels;

	public Vehicle()
	{
		super();
		this.color = "white";
		this.wheels = 4;
	}

	public Vehicle(String color, int wheels)
	{
		super();
		this.color = color;
		this.wheels = wheels;
	}

	public void drive()
	{
		System.out.println("This vehicle can be driven");
	}

	public String getColor()
	{
		return this.color;
	}

	public int getWheels()
	{
		return this.wheels;
	}

	public void requestRegistration()
	{
		System.out.println("The " + this.getClass().getSimpleName().toLowerCase() + " has not been register.");
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}

	@Override
	public String toString()
	{
		return "This vehicle's color is " + this.color + ", and it has " + this.wheels + " wheels.";
	}
}
