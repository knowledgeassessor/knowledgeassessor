package com.knowledgeassessor.service;

import java.util.List;

import com.knowledgeassessor.hibernate.Exam;
import com.knowledgeassessor.hibernate.Questions;

public interface QuestionsService {

	//public void addQuestion(Questions questions);
	public List<Questions> listQuestionsForExam(Integer id);
	//public void removeQuestion(Integer id);
}
