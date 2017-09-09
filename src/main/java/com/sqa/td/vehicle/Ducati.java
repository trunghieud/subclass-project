package com.sqa.td.vehicle;

public class Ducati extends Motorcycle
{

	private int cost;

	private String manufacturer;

	public Ducati()
	{
		super();
		this.manufacturer = "Italy";
		this.cost = 30000;
	}

	public Ducati(String manufacturer, int cost)
	{
		super();
		this.manufacturer = manufacturer;
		this.cost = cost;
	}

	public Ducati(String color, int wheels, Type type, String power, int cost, String manufacturer)
	{
		super(color, wheels, type, power);
		this.cost = cost;
		this.manufacturer = manufacturer;
	}

	public int getCost()
	{
		return this.cost;
	}

	public String getManufacturer()
	{
		return this.manufacturer;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString()
	{
		return super.toString() + " The manufacturer is " + this.manufacturer + " and it cost " + this.cost;
	}
}
