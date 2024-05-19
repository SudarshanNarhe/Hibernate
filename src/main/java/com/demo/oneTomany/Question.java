package com.demo.oneTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	private String quename;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="orderlist")
	private List<Answer> answers;
	
	public Question() {
		
	}

	public Question(int qid, String quename, List<Answer> answers) {
		super();
		this.qid = qid;
		this.quename = quename;
		this.answers = answers;
	}

	public Question(String quename, List<Answer> answers) {
		super();
		this.quename = quename;
		this.answers = answers;
	}
	

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuename() {
		return quename;
	}

	public void setQuename(String quename) {
		this.quename = quename;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", quename=" + quename + ", answers=" + answers + "]";
	}
	
	
}
