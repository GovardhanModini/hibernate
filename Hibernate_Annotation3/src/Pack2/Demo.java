package Pack2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import java.util.*;
public class Demo {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Scanner s=new Scanner(System.in);
	    Employee3 e3=new Employee3();
	    e3.setEmpid(s.nextInt());
	    e3.setEmpname(s.nextLine());
	    e3.setEmpjob(s.nextLine());
	    e3.setEmpsal(s.nextInt());
	    session.save(e3);
	    t.commit();
	    System.out.println("Successfully Registered");
	    factory.close();
	    session.close();
	    s.close();
	    
		
    }
}	
		