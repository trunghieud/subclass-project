package com.sqa.td.vehicle;

public class Car extends Vehicle
{

	private String engineType;

	private String autonomousVehicle;

	public Car()
	{
		super();
		this.engineType = "gasoline";
		this.autonomousVehicle = "disable";
	}

	public Car(String color, int wheels, String engineType, String autonomousVehicle)
	{
		super(color, wheels);
		this.engineType = engineType;
		this.autonomousVehicle = autonomousVehicle;
	}

	public Car(String engineType, String autonomousVehicle)
	{
		super();
		this.engineType = engineType;
		this.autonomousVehicle = autonomousVehicle;
	}

	public void checkEngine()
	{
		System.out.println(this.getClass().getSimpleName() + " vehicle need a schedule maintenance.");
	}

	@Override
	public void drive()
	{
		System.out.println("The " + this.getClass().getSimpleName().toLowerCase() + " drives smoothly.");
		this.requestDestination("New York");
		this.checkEngine();
	}

	public String getAutonomousVehicle()
	{
		return this.autonomousVehicle;
	}

	public String getEngineType()
	{
		return this.engineType;
	}

	public void requestDestination(String destination)
	{
		System.out.println(this.getClass().getSimpleName() + " car is headed to " + destination);
	}

	public void setAutonomousVehicle(String autonomousVehicle)
	{
		this.autonomousVehicle = autonomousVehicle;
	}

	public void setEngineType(String engineType)
	{
		this.engineType = engineType;
	}

	@Override
	public String toString()
	{
		return super.toString() + " It is a " + this.engineType + " engine and the autonomous vehicle is "
				+ this.autonomousVehicle + ".";
	}
}
