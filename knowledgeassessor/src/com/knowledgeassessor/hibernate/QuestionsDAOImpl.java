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

	@Override
	public List<Questions> listQuestions() {
		
		return sessionFactory.getCurrentSession().createQuery("from Questions").list();
	}

	@Override
	public void removeQuestion(Integer id) {
		Questions questions = (Questions) sessionFactory.getCurrentSession().load(Questions.class, id);
		if(null != questions){
			sessionFactory.getCurrentSession().delete(questions);
		}
		
	}

	

}
