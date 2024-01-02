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
		ArrayList<String> list2=new ArrayList<String>();
	    list2.add("Java is a platform");
	    list2.add("Java is a Programming language");
	    list2.add("Java is high level oop language");
		ArrayList<String> list3=new ArrayList<String>();
	    list3.add("Oracle is a Database");
	    Question q1=new Question();
	    q1.setQname("1. What is Java?");
	    q1.setAnswers(list2);
	    Question q2=new Question();
	    q2.setQname("2.What is Oracle?");
	    q2.setAnswers(list3);
	    session.persist(q1);
	    session.persist(q2);
		t.commit();
		System.out.println("Product Registered");
		factory.close();
		session.close();
    }
}