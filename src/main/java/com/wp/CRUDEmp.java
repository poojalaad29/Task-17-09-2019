package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDEmp {
	public static void main(String[]ar)
	{
		Configuration config=new Configuration().configure();
	    SessionFactory sf=config.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction tr=session.beginTransaction();
       /*Emp emp=new Emp();
        emp.setEno(114);
        emp.setEname("DDD");
        emp.setSal(20000);
        emp.setLaptop(new Laptop("L115"));
        emp.setVehicle(new Vehicle("V115"));
       emp.getProjects().add(new Project("P115"));
    
    session.save(emp);
    
    tr.commit();
    System.out.println("Inserted Successfully");
    System.out.println("=============================================================");
    
    //System.out.println("Delete Row");
    //Emp emp=new Emp(114);
    //session.delete(emp);
    //tr.commit();
   // System.out.println("Deleted Row");*/
	    
    System.out.println("Update row");
    Emp emp=session.get(Emp.class,114);
    emp.setEname("Pooja");
    session.update(emp);
    tr.commit();
    System.out.println("Updated");
    
	}
  }


