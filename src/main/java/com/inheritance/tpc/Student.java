package com.inheritance.tpc;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Student1")
@AttributeOverrides({
	@AttributeOverride(name="id", column = @Column(name="id")),
	@AttributeOverride(name="name", column = @Column(name="name")),
	@AttributeOverride(name="age", column = @Column(name="age")),
	@AttributeOverride(name="email", column = @Column(name="email"))
})
public class Student extends Person{
	
	private int rollNo;
	private double marks;
	
	public Student() {
		
	}

	public Student(int id, String name, int age, String email, int rollNo, double marks) {
		super(id, name, age, email);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public Student(String name, int age, String email, int rollNo, double marks) {
		super(name, age, email);
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}
	
	
}
