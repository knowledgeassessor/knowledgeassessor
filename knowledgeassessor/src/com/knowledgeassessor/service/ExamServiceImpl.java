package com.knowledgeassessor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.knowledgeassessor.hibernate.*;

@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamDAO examDAO;
	
	
	@Transactional
	public void addExam(Exam exam) {
		
		examDAO.addExam(exam);
	}

	@Transactional
	public List<Exam> listExam() {
	
		return examDAO.listExam();
	}

	@Transactional
	public void removeExam(Integer id) {
		
		examDAO.removeExam(id);
	}

	
}
