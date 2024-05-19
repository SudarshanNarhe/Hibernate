package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="user_info",
	   uniqueConstraints  = {
		        @UniqueConstraint(columnNames = {"contact"}),
		        @UniqueConstraint(columnNames = {"email"})
		    })
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(nullable = false)
	private String firstname;
	@Column(nullable = false)
	private String lastname;
	@Column(nullable = false,length = 10)
	private String contact;
	@Column(nullable = false,length = 60)
	private String email;
	@Column(nullable = false,columnDefinition ="VARCHAR(100) DEFAULT 'User'")
	private String userrole;
	
	public User() {
		
	}

	public User(int userid, String firstname, String lastname, String contact, String email, String userrole) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.email = email;
		this.userrole = userrole;
	}

	public User(String firstname, String lastname, String contact, String email, String userrole) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.email = email;
		this.userrole = userrole;
	}
	

	public User(String firstname, String lastname, String contact, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
		this.email = email;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", contact=" + contact
				+ ", email=" + email + ", userrole=" + userrole + "]";
	}
	
	
	
	
}
