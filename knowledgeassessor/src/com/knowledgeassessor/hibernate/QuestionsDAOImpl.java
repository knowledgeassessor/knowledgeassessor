/**
 * 
 */
package com.knowledgeassessor.hibernate;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author adam
 *
 */
@Repository
public class QuestionsDAOImpl implements QuestionsDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addQuestion(Questions questions) {
		sessionFactory.getCurrentSession().save(questions);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Questions> listQuestionsForExam(Exam id) {
		
		return sessionFactory.getCurrentSession().createQuery("from Questions where examId = " + id ).list();
	}

	@Override
	public void removeQuestion(Integer id) {
		Questions question = (Questions) sessionFactory.getCurrentSession().load(Questions.class, id);
		if(null != question){
			sessionFactory.getCurrentSession().delete(question);
		}
		
	}

	

}
