package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Quiz {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String title;
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//	@JoinTable(
//			name="quiz_question",
//			joinColumns = @JoinColumn(name="quiz",referencedColumnName = "id"),
//			inverseJoinColumns = @JoinColumn(name="questionex",referencedColumnName = "id"))
	private List<Question> questions;
	public int getQuizId() {
		return id;
	}
	public void setQuizId(int quizId) {
		this.id = quizId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "Quiz [quizId=" + id + ", title=" + title + ", questions=" + questions + "]";
	}

}
