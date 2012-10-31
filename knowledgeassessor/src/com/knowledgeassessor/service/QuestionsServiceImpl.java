package com.knowledgeassessor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.knowledgeassessor.hibernate.Exam;
import com.knowledgeassessor.hibernate.Questions;
import com.knowledgeassessor.hibernate.QuestionsDAO;

@Service
public class QuestionsServiceImpl implements QuestionsService{

	@Autowired
	private QuestionsDAO questionsDAO;
	/*
	@Transactional
	public void addQuestion(Questions questions) {
		
		questionsDAO.addQuestion(questions);
	}
	*/

	@Transactional
	public List<Questions> listQuestionsForExam(Integer id) {
		
		return questionsDAO.listQuestionsForExam(id);
	}
/*
	@Transactional
	public void removeQuestion(Integer id) {
		questionsDAO.removeQuestion(id);
		
	}
	*/



}
