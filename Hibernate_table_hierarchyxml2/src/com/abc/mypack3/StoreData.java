package com.abc.mypack3;

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
		Account a=new Account();
		CreditCard c=new CreditCard();
		DebitCard d=new DebitCard();
		GoldLoan g=new GoldLoan();
		HouseLoan h=new HouseLoan();
		a.setName("Harshad");
		c.setCbalance(20000);
		d.setDbalance(50000);
		g.setLoanamount(4000);
		h.setLoanemi(5000);
		session.save(a);
		session.save(c);
		session.save(d);
		session.save(g);
		session.save(h);
		t.commit();
		System.out.println("Account Details Cleared");
		factory.close();
		session.close();
    }
		
		


}
