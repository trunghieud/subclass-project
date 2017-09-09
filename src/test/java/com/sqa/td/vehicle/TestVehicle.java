package com.sqa.td.vehicle;

import org.testng.annotations.*;

public class TestVehicle
{

	@Test
	public void testVehicle()
	{
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = new Vehicle("red", 4);
		vehicles[1] = new Motorcycle("black", 2, Type.SPORT_BIKE, "200HP");
		vehicles[2] = new Tesla("red", 4, "electric", "enable", "Commuter Fleet", 80000);
		for (int i = 0; i < vehicles.length; i++)
		{
			System.out.println(vehicles[i]);
		}
		for (int i = 0; i < vehicles.length; i++)
		{
			vehicles[i].drive();
			vehicles[i].requestRegistration();
		}
	}
}
