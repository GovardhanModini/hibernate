package pack1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {

	public static void main( String[] args )
    {
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		Project project=new Project();
		project.setProjectName("TPO");
		project.setProjectStatus(ProjectStatus.COMPLETED);
		session.save(project);
		
		List<Project> projects=session.createQuery("from Project",Project.class).list();
		projects.forEach(s->{
			System.out.println(s.getProjectName());
			System.out.println(s.getProjectStatus());
		
		});
		t.commit();
		System.out.println("Result:Pass");
		factory.close();
		session.close();
    }

}
