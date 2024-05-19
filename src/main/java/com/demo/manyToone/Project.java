package com.demo.manyToone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="projects")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String projectname;
	private String prtechnology;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Student> slist;
	
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int id, String projectname, String prtechnology) {
		super();
		this.id = id;
		this.projectname = projectname;
		this.prtechnology = prtechnology;
	}

	public Project(String projectname, String prtechnology) {
		super();
		this.projectname = projectname;
		this.prtechnology = prtechnology;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getPrtechnology() {
		return prtechnology;
	}

	public void setPrtechnology(String prtechnology) {
		this.prtechnology = prtechnology;
	}
	

	public List<Student> getSlist() {
		return slist;
	}

	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectname=" + projectname + ", prtechnology=" + prtechnology + ", slist="
				+ slist + "]";
	}	
	
}
