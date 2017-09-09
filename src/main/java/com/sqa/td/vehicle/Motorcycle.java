package com.sqa.td.vehicle;

public class Motorcycle extends Vehicle
{

	private Type type;

	private String power;

	public Motorcycle()
	{
		super();
		this.type = Type.SPORT_BIKE;
		this.power = "0HP";
	}

	public Motorcycle(String color, int wheels, Type type, String power)
	{
		super(color, wheels);
		this.type = type;
		this.power = power;
	}

	public Motorcycle(Type type, String power)
	{
		super();
		this.type = type;
		this.power = power;
	}

	@Override
	public void drive()
	{
		System.out.println("The " + this.getClass().getSimpleName().toLowerCase() + " drives rough.");
		requestSafetyGears();
		restTime(150);
	}

	public String getPower()
	{
		return this.power;
	}

	public Type getType()
	{
		return this.type;
	}

	public void requestSafetyGears()
	{
		System.out.println("Please make sure you have all your safety gears before riding!");
	}

	public boolean restTime(int driveTime)
	{
		if (driveTime > 180)
		{
			System.out.println("It's time to rest!");
			return true;
		} else
		{
			System.out.println("It's almost time to rest.");
			return false;
		}
	}

	public void setPower(String power)
	{
		this.power = power;
	}

	public void setType(Type type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return super.toString() + " It is a " + this.type + " and has " + this.power + ".";
	}
}
