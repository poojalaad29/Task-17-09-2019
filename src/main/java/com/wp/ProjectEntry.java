package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectEntry {
public static void main(String args[]){
		
		Project p1=new Project("P111","AcSw",5);
		Project p2=new Project("P112","InvSw",6);
		Project p3=new Project("P113","BnkSw",7);
		Project p4=new Project("P114","SecSw",3);
		Project p5=new Project("P115","InsSw",4);
		Project p6=new Project("P116","ERP",8);
		
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(p1); session.save(p2);
		session.save(p3); session.save(p4);
		session.save(p5); session.save(p6);
		tr.commit();
		session.close();
		
		System.out.println("Project Stored Successfully");
	}

}
