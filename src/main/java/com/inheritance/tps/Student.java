package com.inheritance.tps;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Student2")
@PrimaryKeyJoinColumn(name="id")
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
