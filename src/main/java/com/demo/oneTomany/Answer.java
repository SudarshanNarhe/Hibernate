package com.demo.oneTomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answername;
	private String postedBy;
	
	public Answer() {
		
	}
	public Answer(int id, String answername) {
		super();
		this.id = id;
		this.answername = answername;
	}
	
	public Answer(int id, String answername, String postedBy) {
		super();
		this.id = id;
		this.answername = answername;
		this.postedBy = postedBy;
	}
	
	
	public Answer(String answername, String postedBy) {
		super();
		this.answername = answername;
		this.postedBy = postedBy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	
	
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answername=" + answername + ", postedBy=" + postedBy + "]";
	}
	
	
	
	
}
