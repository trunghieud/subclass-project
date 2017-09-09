package com.sqa.td.school;

import org.testng.annotations.*;

public class SchoolTest
{

	@Test
	public void testSchool()
	{
		Person[] people = new Person[5];
		people[0] = new Person("JF", 34);
		people[1] = new Employee("Vlad", 21, 6000, "Supervisor");
		people[2] = new Counselor();
		people[3] = new Teacher("Hieu", 12, 250000, "Mathematician", Subject.MATH, 2);
		people[4] = new Coach();
		for (int i = 0; i < people.length; i++)
		{
			System.out.println(people[i]);
		}
		for (int i = 0; i < people.length; i++)
		{
			people[i].speak();
			people[i].doSomething();
		}
	}
}
