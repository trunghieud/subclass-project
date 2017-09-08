package com.sqa.td;

public class Teacher extends SchoolFaculty
{

	private String chemistry;

	private int students;

	private double salary;

	public void calFacultyPerStudents(int students)
	{
		if (students < 15)
		{
			System.out.println("This is a small class");
		} else
			System.out.println("This is a big class. We will need one more teacher.");
	}
}
