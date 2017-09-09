package com.sqa.td.school;

public class Person
{

	private String name;

	private int age;

	public Person()
	{
		super();
		this.name = "John Doe";
		this.age = 18;
	}

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public void doSomething()
	{
		System.out.println(this.name + " decides not do anything.");
	}

	public int getAge()
	{
		return this.age;
	}

	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println("The " + this.getClass().getSimpleName().toLowerCase() + " speaks out loud...");
	}

	@Override
	public String toString()
	{
		return this.getClass().getSimpleName() + " name=" + this.name + ", age=" + this.age;
	}
}
