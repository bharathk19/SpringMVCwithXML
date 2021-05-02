package com.learning.springmvcthroughxml.demo.Test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.springmvcthroughxml.demo.entity.StudentEntity;

public class HibernateRead {

	public static void main(String[] args) {
		SessionFactory  sf = new Configuration().
				configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory();
		ArrayList<StudentEntity> students = new ArrayList<StudentEntity>();
		
		students.add(new StudentEntity("Swathi", "sanginedi", "swathi.sanginedi@gmail.com"));
		students.add(new StudentEntity("Mounika", "Donthula", "monu.mounika1234@gmail.com"));
		students.add(new StudentEntity("Sony", "Kummari", "sony.snickers@gmail.com"));
		students.add(new StudentEntity("Ammulu", "Kummari", "ammmulu.snickers@gmail.com"));
		try {
			
			Session session = sf.getCurrentSession();
			
			
			session.beginTransaction();
			
			for(StudentEntity stud : students)
			{
				session.save(stud);
			}
			
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
