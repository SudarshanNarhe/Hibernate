package com.demo.manyToone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PrStudent")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdid;
	private String stdname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="prid")
	private Project project;
	private String stdrole;
	
	public Student() {
		
	}

	public Student(int stdid, String stdname, Project project, String stdrole) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.project = project;
		this.stdrole = stdrole;
	}

	public Student(String stdname, Project project, String stdrole) {
		super();
		this.stdname = stdname;
		this.project = project;
		this.stdrole = stdrole;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getStdrole() {
		return stdrole;
	}

	public void setStdrole(String stdrole) {
		this.stdrole = stdrole;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", project=" + project + ", stdrole=" + stdrole
				+ "]";
	}
	
	
	
}
