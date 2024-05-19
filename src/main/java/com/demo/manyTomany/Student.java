package com.demo.manyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="student111")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String fname;
	private String lname;
	@ManyToMany
	private List<Course>courselist;
	
	public Student() {
		super();
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Student(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public Student(String sname, List<Course> courselist) {
		super();
		this.fname = sname;
		this.courselist = courselist;
	}

	public Student(int sid, String sname, List<Course> courselist) {
		super();
		this.sid = sid;
		this.fname = sname;
		this.courselist = courselist;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return fname;
	}

	public void setSname(String sname) {
		this.fname = sname;
	}

	public List<Course> getCourselist() {
		return courselist;
	}

	public void setCourselist(List<Course> courselist) {
		this.courselist = courselist;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + fname + ", courselist=" + courselist + "]";
	}
	
}

