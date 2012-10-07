package com.knowledgeassessor.controller;

import java.util.Iterator;
import java.util.List;

import com.knowledgeassessor.persistence.*;
import com.knowledgeassessor.persistence.exam;
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
			List exams = session.createQuery("from exam").list();
			for(@SuppressWarnings("rawtypes")
			Iterator it = exams.iterator(); it.hasNext();){
				exam xam = (exam) it.next();
				System.out.println("Exam ID = " + xam.getId());
			}
		
		}catch(HibernateException e){
			System.out.println(e);
		}
		
		
	}

}
