package com.knowledgeassessor.hibernate;

import java.util.List;

public interface QuestionsDAO {

	public void addQuestion(Questions questions);
	public List<Questions> listQuestions();
	public void removeQuestion(Integer id);
}
