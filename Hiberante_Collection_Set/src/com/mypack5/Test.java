package com.mypack5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*;

public class Test {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		HashSet<String> set1=new HashSet<String>();
		HashSet<String> set2=new HashSet<String>();
		HashSet<String> set3=new HashSet<String>();
		set1.add("Java is a platform");
		set1.add("Java is a Programming language");
	    set1.add("Java is high level oop language");
	    set2.add("Python is fast");
	    set2.add("Coding Language");
	    set3.add("database");
	    set3.add("secured");
	    
	  
	    
	    Question q1=new Question();
	    q1.setQname("1. What is Java?");
	    q1.setAnswers(set1);
	    Question q2=new Question();
	    q2.setQname("2.What is Python?");
	    q2.setAnswers(set2);
	    Question q3=new Question();
	    q3.setQname("What is DataBase");
	    q3.setAnswers(set3);
	    session.persist(q1);
	    session.persist(q2);
	    session.persist(q3);
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
    }
}