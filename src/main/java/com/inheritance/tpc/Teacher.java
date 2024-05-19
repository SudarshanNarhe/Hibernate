package com.inheritance.tpc;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Teacher1")
@AttributeOverrides({
	@AttributeOverride(name="id", column = @Column(name="id")),
	@AttributeOverride(name="name", column = @Column(name="name")),
	@AttributeOverride(name="age", column = @Column(name="age")),
	@AttributeOverride(name="email", column = @Column(name="email"))
})
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
