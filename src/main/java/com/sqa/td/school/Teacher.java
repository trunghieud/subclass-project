package com.sqa.td.school;

public class Teacher extends Employee
{

	private Subject subject;

	private int pupils;

	public Teacher()
	{
		super();
		this.subject = Subject.MATH;
		this.pupils = 30;
	}

	public Teacher(String name, int age, double salary, String jobTitle, Subject subject, int pupils)
	{
		super(name, age, salary, jobTitle);
		this.subject = subject;
		this.pupils = pupils;
	}

	public Teacher(Subject subject, int pupils)
	{
		super();
		this.subject = Subject.MATH;
		this.pupils = 30;
	}

	@Override
	public void doSomething()
	{
		super.doSomething();
		teach();
		giveQuiz();
	}

	public int getPupils()
	{
		return this.pupils;
	}

	public Subject getSubject()
	{
		return this.subject;
	}

	public void giveQuiz()
	{
		System.out.println(this.getName() + " gives a pop quiz!");
	}

	public void setPupils(int pupils)
	{
		this.pupils = pupils;
	}

	public void setSubject(Subject subject)
	{
		this.subject = subject;
	}

	public void teach()
	{
		System.out.println("The " + this.getSubject().toString().toLowerCase() + " teacher, lectures its "
				+ this.getPupils() + " pupil(s).");
	}

	@Override
	public String toString()
	{
		return super.toString() + " subject=" + this.subject + ", pupils=" + this.pupils + "]";
	}
}
