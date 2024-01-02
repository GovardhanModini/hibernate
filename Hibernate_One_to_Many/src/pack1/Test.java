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
		
		Answer ans1=new Answer();
		ans1.setAnswername("Alphabet");
		ans1.setPostedby("raghu");
		Answer ans2=new Answer();
		ans2.setAnswername("character");
		ans2.setPostedby("vamsi");
		
		ArrayList<Answer> list1=new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		Question q1=new Question();
		q1.setQname("What is A");
		q1.setAnswers(list1);
		
		session.persist(q1);


		
		t.commit();
		System.out.println("Successfully Saved");
		factory.close();
		session.close();
    }
}