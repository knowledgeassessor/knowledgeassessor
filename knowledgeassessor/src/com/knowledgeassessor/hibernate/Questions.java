package com.knowledgeassessor.hibernate;

// Generated Sep 10, 2012 9:19:12 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Questions generated by hbm2java
 */
@Entity
@Table(name = "Questions")
public class Questions implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int examId;
	private String question;
	private String choiceOne;
	private String choiceTwo;
	private String choiceThree;
	private String choiceFour;
	private int correctChoice;

	public Questions() {
	}

	public Questions(int examId, String question, String choiceOne,
			String choiceTwo, String choiceThree, String choiceFour,
			int correctChoice) {
		this.examId = examId;
		this.question = question;
		this.choiceOne = choiceOne;
		this.choiceTwo = choiceTwo;
		this.choiceThree = choiceThree;
		this.choiceFour = choiceFour;
		this.correctChoice = correctChoice;
	}

	@Id
	@GeneratedValue
	@Column(name = "question_id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "exam_id")
	public int getExamId() {
		return this.examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	@Column(name = "question")
	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "choice_one")
	public String getChoiceOne() {
		return this.choiceOne;
	}

	public void setChoiceOne(String choiceOne) {
		this.choiceOne = choiceOne;
	}

	@Column(name = "choice_two")
	public String getChoiceTwo() {
		return this.choiceTwo;
	}

	public void setChoiceTwo(String choiceTwo) {
		this.choiceTwo = choiceTwo;
	}

	@Column(name = "choice_three")
	public String getChoiceThree() {
		return this.choiceThree;
	}

	public void setChoiceThree(String choiceThree) {
		this.choiceThree = choiceThree;
	}

	@Column(name = "choice_four")
	public String getChoiceFour() {
		return this.choiceFour;
	}

	public void setChoiceFour(String choiceFour) {
		this.choiceFour = choiceFour;
	}

	@Column(name = "correct_choice")
	public int getCorrectChoice() {
		return this.correctChoice;
	}

	public void setCorrectChoice(int correctChoice) {
		this.correctChoice = correctChoice;
	}

}