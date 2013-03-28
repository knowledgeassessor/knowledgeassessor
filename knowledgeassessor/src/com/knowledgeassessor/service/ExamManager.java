package com.knowledgeassessor.service;

import java.io.Serializable;
import java.util.List;

import com.knowledgeassessor.domain.Exam;

public interface ExamManager extends Serializable{

	public List<Exam> getQuestions();
	
	public List<Exam> getAnswers();
	
	public int examScore();
	
	public String examStatus();

}
