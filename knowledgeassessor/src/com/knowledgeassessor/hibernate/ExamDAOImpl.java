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
public class ExamDAOImpl implements ExamDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addExam(Exam exam) {
		sessionFactory.getCurrentSession().save(exam);
	}


	@SuppressWarnings("unchecked")
	public List<Exam> listExam() {
		return sessionFactory.getCurrentSession().createQuery("from Exam").list();
	}


	public void removeExam(Integer id) {	
		Exam exam = (Exam) sessionFactory.getCurrentSession().load(Exam.class, id);
		if(null != exam){
			sessionFactory.getCurrentSession().delete(exam);
		}
		
	}

}
