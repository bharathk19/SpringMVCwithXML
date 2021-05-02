package com.learning.springmvcthroughxml.demo.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.springmvcthroughxml.demo.entity.StudentEntity;

public class Hibernatetest {

	public static void main(String[] args) {
		SessionFactory  sf = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory();
		try {
			
			Session session = sf.getCurrentSession();
			
			StudentEntity s = new StudentEntity("Bharath", "kummari", "kummari289@gmail.com");
			
			session.beginTransaction();
			
			session.save(s);
			
			session.getTransaction().commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			sf.close();
		}

	}

}
