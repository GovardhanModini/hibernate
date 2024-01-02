package com.mypack4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreData 
{
	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		College ob1=new College();
		ob1.setCname("Chaitanya");
		Branch1 b1=new Branch1();
		b1.setBid(2001);
		b1.setBname("Gardens");
		Branch2 b2=new Branch2();
		b2.setBid2(3001);
		b2.setBname2("Ponnuru");
		session.persist(ob1);
		session.persist(b1);
		session.persist(b2);
		t.commit();
		System.out.println("College Details Cleared");
		factory.close();
		session.close();
    }
		
		


}
