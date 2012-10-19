package com.knowledgeassessor.hibernate;

import java.util.List;

public interface ExamDAO {

	public void addExam(Exam exam);
	public List<Exam> listExam();
	public void removeExam(Integer id);
	
	
}
