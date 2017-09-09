package com.sqa.td.vehicle;

public class Tesla extends Car
{

	private String autonomousFleet;

	private double cost;

	public Tesla()
	{
		super();
		this.autonomousFleet = "Commuter Fleet";
		this.cost = 70000;
	}

	public Tesla(String autonomousFleet, double cost)
	{
		super();
		this.autonomousFleet = autonomousFleet;
		this.cost = cost;
	}

	public Tesla(String color, int wheels, String engineType, String autonomousVehicle, String autonomousFleet,
			double cost)
	{
		super(color, wheels, engineType, autonomousVehicle);
		this.autonomousFleet = autonomousFleet;
		this.cost = cost;
	}

	@Override
	public void drive()
	{
		super.drive();
		pickupCustomer();
		requestCarpool();
	}

	public String getAutonomousFleet()
	{
		return this.autonomousFleet;
	}

	public double getCost()
	{
		return this.cost;
	}

	public void pickupCustomer()
	{
		System.out.println(this.getAutonomousFleet() + " will pickup the customer.");
	}

	public void requestCarpool()
	{
		System.out.println(this.getAutonomousFleet() + " will pickup multiple customer for carpool.");
	}

	public void setAutonomousFleet(String autonomousFleet)
	{
		this.autonomousFleet = autonomousFleet;
	}

	public void setCost(double cost)
	{
		this.cost = cost;
	}

	@Override
	public String toString()
	{
		return super.toString() + "It is part of the " + this.autonomousFleet + " and the cost is " + this.cost + ".";
	}
}
