package com.sqa.td;

public class Person
{

	private String nationality;

	private String religion;

	public Person()
	{
		super();
		this.nationality = "USA";
		this.religion = "None";
	}

	/**
	 * @param nationality
	 */
	public Person(String nationality)
	{
		this();
		this.nationality = nationality;
	}

	public void determineCitizenshipStatus(String country)
	{
		if (country == "USA")
		{
			System.out.println("You are a US citizen and eligible to work.");
		} else
			System.out.println("You are not a US citizen and are not eligible to work.");
	}

	/**
	 * @return the nationality
	 */
	public String getNationality()
	{
		return this.nationality;
	}

	/**
	 * @return the religion
	 */
	public String getReligion()
	{
		return this.religion;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}

	/**
	 * @param religion
	 *            the religion to set
	 */
	public void setReligion(String religion)
	{
		this.religion = religion;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Your nationality is " + this.nationality + " and your religion is " + this.religion;
	}
}
