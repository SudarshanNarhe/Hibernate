package com.demo.oneToone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Dept1")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dep_id;
	private String dep_name;
	@OneToOne(targetEntity = Employee.class)
	private Employee employee;
	
	public Department() {
		
	}

	public Department(int dep_id, String dep_name, Employee employee) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.employee = employee;
	}

	public Department(String dep_name, Employee employee) {
		super();
		this.dep_name = dep_name;
		this.employee = employee;
	}

	public Department(String dep_name) {
		super();
		this.dep_name = dep_name;
	}

	public int getDep_id() {
		return dep_id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [dep_id=" + dep_id + ", dep_name=" + dep_name + ", employee=" + employee + "]";
	}
	
	
	
}
