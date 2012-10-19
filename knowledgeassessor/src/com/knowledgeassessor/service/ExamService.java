package com.knowledgeassessor.service;

import java.util.List;

import com.knowledgeassessor.hibernate.Exam;

public interface ExamService {

	public void addExam(Exam exam);
	public List<Exam> listExam();
	public void removeExam(Integer id);
}
