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
		HashMap<String,String> map1=new HashMap<String,String>();
		map1.put("Java is a Programming Language","John Milton");
		map1.put("Java is a Platform","David");
		Question q1=new Question();
		q1.setName("ram");
		q1.setQname("What is Java?");
		q1.setAnswers(map1);
		
		HashMap<String,String> map2=new HashMap<String,String>();
		map2.put("C a programming language", "David");
		map2.put("C  is easy", "Kumar");
		Question q2=new Question();
		q2.setName("sachin");
		q2.setQname("What is C?");
		q2.setAnswers(map2);
		session.persist(q1);
		session.persist(q2);
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
    }
}