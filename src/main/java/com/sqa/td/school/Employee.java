package com.sqa.td.school;

public class Employee extends Person
{

	private double salary;

	private String jobTitle;

	public Employee()
	{
		super();
		this.jobTitle = "Worker";
		this.salary = 10000;
	}

	public Employee(String jobTitle, double salary)
	{
		super();
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public Employee(String name, int age, double salary, String jobTitle)
	{
		super(name, age);
		this.salary = salary;
		this.jobTitle = jobTitle;
	}

	@Override
	public void doSomething()
	{
		System.out.println(this.getName() + " decides to do something.");
		this.dowork();
		this.requestPay();
	}

	public void dowork()
	{
		System.out.println(this.getJobTitle() + " does his duties....");
	}

	public String getJobTitle()
	{
		return this.jobTitle;
	}

	public double getSalary()
	{
		return this.salary;
	}

	public void requestPay()
	{
		System.out.println(
				"The " + this.getAge() + " year old, requests a portion of his " + this.getSalary() + " salary.");
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	@Override
	public void speak()
	{
		System.out.println(
				"The " + this.getClass().getSimpleName().toLowerCase() + " speaks quietly in classroom level voice.");
	}

	@Override
	public String toString()
	{
		return super.toString() + " jobTitle=" + this.jobTitle + ", salary=" + this.salary;
	}
}
