package com.sqa.td;

public class Employee extends Person
{

	private int numEmployees;

	private int seniority;

	private boolean isBackgroundCheck;

	
	/**
	 * @param numEmployees
	 * @param seniority
	 */
	public Employee(int numEmployees, int seniority)
	{
		super();
		this.numEmployees = numEmployees;
		this.seniority = seniority;
	}

	public Employee()
	{
		super();
		this.numEmployees = 0;
		this.seniority = 1;
	}

	/**
	 * @return the numEmployees
	 */
	public int getNumEmployees()
	{
		return numEmployees;
	}

	
	/**
	 * @param numEmployees the numEmployees to set
	 */
	public void setNumEmployees(int numEmployees)
	{
		this.numEmployees = numEmployees;
	}

	
	/**
	 * @return the seniority
	 */
	public int getSeniority()
	{
		return seniority;
	}

	
	/**
	 * @param seniority the seniority to set
	 */
	public void setSeniority(int seniority)
	{
		this.seniority = seniority;
	}

	public int determineSeniority(int years)
	{
		System.out.println("You have been working for " + years);
		// seniority = 3, junior = 2, and entry = 1
		if (years > 10)
		{
			System.out.println("Wow, you have been working for awhile. You are a senior level!");
			return 3;
		} else if (years > 5)
		{
			System.out.println("Thanks you for making a difference. You are a junior level!");
			return 2;
		} else
		{
			System.out.println("You are just beginning your career. ");
			return 1;
		}
	}
}
