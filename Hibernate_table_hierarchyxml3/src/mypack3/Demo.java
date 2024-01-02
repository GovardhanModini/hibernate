package mypack3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Demo 
{
	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		College c=new College();
		Student s=new Student();
		Faculty f=new Faculty();
		Library l=new Library();
		c.setCname("JKC");
		c.setCloc("Guntur");
		s.setSid(1);
		s.setSname("sai");
		f.setFname("Srinu");
		f.setFdept("Chemistry");
		l.setLbooks(3000);
		session.save(s);
		session.save(f);
		session.save(l);
		session.save(c);
		t.commit();
		System.out.println("College Details Registered");
		factory.close();
		session.close();
		
		
    }

}
