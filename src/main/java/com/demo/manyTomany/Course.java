package com.demo.manyTomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course111")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	private String coursename;
	private double courseprice;
//	@ManyToMany
//	private List<Student>slist;
	
	public Course(String coursename, double courseprice) {
		super();
		this.coursename = coursename;
		this.courseprice = courseprice;
	}

	public Course() {
		super();
	}

	
	public Course(int courseid, String coursename, double courseprice) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseprice = courseprice;
	//	this.slist = slist;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public double getCourseprice() {
		return courseprice;
	}

	public void setCourseprice(double courseprice) {
		this.courseprice = courseprice;
	}

//	public List<Student> getSlist() {
//		return slist;
//	}
//
//	public void setSlist(List<Student> slist) {
//		this.slist = slist;
//	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", courseprice=" + courseprice
				+  "]";
	}
	
}

