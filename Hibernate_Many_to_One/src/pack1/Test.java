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
		e1.setName("ramesh");
		Employee e2=new Employee();
		e2.setName("raju");
		
		Address ad1=new Address();
		ad1.setCity("hyd");
		ad1.setCountry("India");
		ad1.setPincode(522003);
		ad1.setState("ts");
		
		e1.setAd(ad1);
		e2.setAd(ad1);
		


		
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
    }
}