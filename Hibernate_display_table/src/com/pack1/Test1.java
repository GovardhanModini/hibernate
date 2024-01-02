package com.pack1;

import org.hibernate.*;
import javax.persistence.*;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import java.util.*;

public class Test1 {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		TypedQuery query=session.createQuery("from Sample");
		List<Sample> list=query.getResultList();
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			Sample s=(Sample)i.next();
			System.out.println(s.getId()+"---"+s.getName());
			
			}
		
		
		
		session.close();
		factory.close();
		
    }}

