package com.learning.springmvcthroughxml.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.springmvcthroughxml.demo.entity.StudentEntity;

public class HibernateRed {

	public static void main(String[] args) {
		SessionFactory  sf = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory();
		try {
			
			Session session = sf.getCurrentSession();
			
			session.beginTransaction();
			
			StudentEntity s  = session.get(StudentEntity.class, 4);
			
			System.out.println("Student  : "+s);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			sf.close();
		}

	}

}
