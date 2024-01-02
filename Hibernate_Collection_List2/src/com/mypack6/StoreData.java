package com.mypack6;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*;

public class StoreData {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("TV");
		list1.add("SmartPhone");
		list1.add("Laptops");
		
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("LG smart TV");
		list2.add("Iphone 15 Pro");
		list2.add("Hp pavilion");
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("55000");
		list3.add("145000");
		list3.add("67000");
		
		Product p1=new Product();
		p1.setPname("1.LG");
		p1.setPprice("09370");
		p1.setModels(list1);
		Product p2=new Product();
		p2.setPname("2.Samsung");
		p2.setPprice("98398");
		p2.setModels(list2);
	    
		session.persist(p1);
		session.persist(p2);
		//session.persist(p3);
	    t.commit();
		System.out.println("Product Registered");
		factory.close();
		session.close();
		
		
    
    
    }
	


	

}
