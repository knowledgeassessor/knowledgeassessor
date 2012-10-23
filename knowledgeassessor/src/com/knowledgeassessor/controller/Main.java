package com.knowledgeassessor.controller;

import java.util.Iterator;
import java.util.List;

import com.knowledgeassessor.hibernate.*;

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
		try{
			transaction = session.beginTransaction();
			@SuppressWarnings("rawtypes")
			List exams = session.createQuery("from Exam").list();
			
			for(@SuppressWarnings("rawtypes")
			Iterator ite = exams.iterator(); ite.hasNext();){
				Exam xam = (Exam) ite.next();
				//System.out.println("Exam ID = " + xam.getId());
			}
			
			List questions = session.createQuery("from Questions where examId = '1' ").list();
			for(@SuppressWarnings("rawtypes")
			Iterator itq = questions.iterator(); itq.hasNext();){
				Questions q = (Questions) itq.next();
				System.out.println("Questin id = " + q.getId());
				System.out.println("Questin  = " + q.getQuestion());
				System.out.println("Questin choice = " + q.getChoiceOne());
			}
		
		}catch(HibernateException e){
			System.out.println(e);
		}
		
		
	}

}
