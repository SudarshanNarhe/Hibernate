package com.inheritance.tph;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@DiscriminatorValue("teacher")
public class Teacher extends Person{
	
	private String degree;
	private double salary;
	
	public Teacher() {
		
	}

	public Teacher(String name, int age, String email, String degree, double salary) {
		super(name, age, email);
		this.degree = degree;
		this.salary = salary;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher [degree=" + degree + ", salary=" + salary + "]";
	}
	
	
	
}
