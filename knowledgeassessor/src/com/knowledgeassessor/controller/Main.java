package com.knowledgeassessor.controller;

import java.util.Iterator;
import java.util.List;

import com.knowledgeassessor.hibernate.Exam;
import com.knowledgeassessor.hibernate.HibernateUtil;
import com.knowledgeassessor.hibernate.Questions;
import com.knowledgeassessor.hibernate.QuestionsDAOImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test();
		
	}
	public static void test(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unused")
		Transaction transaction = null;
       // QuestionsDAOImpl qdaoimp = new QuestionsDAOImpl();
        //List<Questions> lsquest = qdaoimp.listQuestionsForExam(1);
		try{
			transaction = session.beginTransaction();
			@SuppressWarnings("rawtypes")
			List exams = session.createQuery("from Exam").list();
			/*
			for(@SuppressWarnings("rawtypes")
			Iterator ite = exams.iterator(); ite.hasNext();){
				Exam xam = (Exam) ite.next();
				//System.out.println("Exam ID = " + xam.getId());
			}
			*/
			
			List questions = session.createQuery("from Questions where examId = '1' ").list();
			for(@SuppressWarnings("rawtypes")
			Iterator itq = questions.iterator(); itq.hasNext();){
			//Iterator itq = lsquest.iterator(); itq.hasNext();){
				Questions q = (Questions) itq.next();
				System.out.println("Questin number " + q.getId());
				System.out.println(q.getQuestion() + " ?");
				System.out.println("1.) " + q.getChoiceOne());
				System.out.println("2.) " + q.getChoiceTwo());
				System.out.println("3.) " + q.getChoiceThree());
				System.out.println("4.) " + q.getChoiceFour());
				System.out.println("\n");
			}
		
		}catch(HibernateException e){
			System.out.println(e);
		}
		
		
	}

}
