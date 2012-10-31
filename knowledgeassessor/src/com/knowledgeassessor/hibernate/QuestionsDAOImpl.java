/**
 * 
 */
package com.knowledgeassessor.hibernate;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Adam Sechler
 *
 */
@Repository
public class QuestionsDAOImpl implements QuestionsDAO{

	@Autowired
	private SessionFactory sessionFactory;
	//
	//@SuppressWarnings("deprecation")
	//public void addQuestion(Exam id, Questions question) {
	//	sessionFactory.getCurrentSession().save(question);
		
	//}

	@SuppressWarnings("unchecked")
	@Override
	public List<Questions> listQuestionsForExam(Integer id) {
		
		return sessionFactory.getCurrentSession().createQuery("from Questions where examId = " + id ).list();
	}

	/*@Override
	public void removeQuestion(Integer id) {
		Questions question = (Questions) sessionFactory.getCurrentSession().load(Questions.class, id);
		if(null != question){
			sessionFactory.getCurrentSession().delete(question);
		}
		
	}
*/
	

}
