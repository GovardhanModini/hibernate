package pack1;

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
		Employee e1=new Employee();
		e1.setName("roshan");
		Address a1=new Address();
		a1.setCity("vizag");
		a1.setCountry("India");
		a1.setState("ap");
		a1.setPincode(522001);
		
		e1.setAd(a1);
		
		a1.setEmp(e1);
		
		
		session.persist(e1);
		session.persist(a1);


		
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
    }
}