package com.learning.springmvcthroughxml.demo.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.build.AllowSysOut;

import com.learning.springmvcthroughxml.demo.entity.StudentEntity;

public class QuerySystemDemo {

	public static void main(String[] args) {
		SessionFactory  sf = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory();
		try {
			// While working with query thing in the Hibernate need the object to reterive the data not the table name
			
			Session session = sf.getCurrentSession();
			
			session.beginTransaction();
			
			List<StudentEntity> s = session.createQuery("from StudentEntity").list();
			
			s.forEach( stud -> {System.out.println(stud);});
			
			System.out.println("************************************************");
			
			List<StudentEntity> s1 = session.createQuery("from StudentEntity s where s.email like '%gmail.com'").list();
			
			s1.forEach( stud -> {System.out.println(stud);});
			
			System.out.println("************************************************");
			
			List<StudentEntity> s2 = session.createQuery("from StudentEntity s where s.lastName='Donthula'").list();
			
			s2.forEach( stud -> {System.out.println(stud);});
			
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
