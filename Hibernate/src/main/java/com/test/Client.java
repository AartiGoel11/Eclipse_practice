package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class Client {

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(111);
		s.setName("Aarti Goel");
		s.setEmail("aarti@yahoo.com");
		s.setAddress("Panchkula");
		
		Configuration cfg = new Configuration();
		
		SessionFactory sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("heloo..11");
		Session s1 = sf.openSession();
		System.out.println("helloo12");
		Transaction tx=s1.beginTransaction();
		s1.save(s);
		tx.commit();
		s1.close();
		sf.close();
	//	s1.evict(s);  student object will be remove from persistant state
	}

}
