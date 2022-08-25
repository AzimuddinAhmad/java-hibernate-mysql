package com.greatlearning.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Student;

public class CreateStudent {
	
public static void main (String[]args) {
	
	// 	create session factory
	SessionFactory factory = new Configuration ()
				.configure ("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
	//	create session
	Session session = factory.getCurrentSession();
	try {
		//  create a student object
		System.out.println("Creating new student object...");
		Student student1 = new Student("Ram","ram@gl.com");
		
		session.beginTransaction ();
		session.save(student1);

//	Teacher teacher1 = new Teacher ("Sarath","Vimal","sarath@gl.com");
//	Teacher teacher1 = new Teacher ("Himanshu","Kumar","himanshu@gl.com");

		//starta transaction
		//session.beginTransaction();
		
		//	save the student object
		System.out.println("saving the teacher...");
//		session.save(student1);
//		session.save(student2);
		
		//comit transaction
		session.getTransaction().commit();
		
		System.out.println("Done");
	}
	finally {
		factory.close();
		}
	}
}
