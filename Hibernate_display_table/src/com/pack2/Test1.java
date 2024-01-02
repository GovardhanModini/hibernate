package com.pack2;

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
		
		TypedQuery query=session.createQuery("from Dept");
		List<Dept> list=query.getResultList();
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			Dept d=(Dept)i.next();
			System.out.println(d.getDEPTNO()+"---"+d.getDNAME()+"--------"+d.getLOC());
			
			}
		
		
		
		session.close();
		System.out.println("Successfully Saved");
		factory.close();
		
    }}

