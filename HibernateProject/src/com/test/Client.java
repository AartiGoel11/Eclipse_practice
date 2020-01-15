package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.beans.Student;

public class Client {

	public static void main(String[] args) {

	
		
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s1 = sf.openSession();
		Student s = new Student();
		s.setId(111);
		s.setName("Aarti Goel");
		s.setEmail("aarti@yahoo.com");
		s.setAddress("Panchkula");
		s1.save(s);
		s1.beginTransaction().commit();
		
	//	s1.evict(s);  student object will be remove from persistant
	}

}
