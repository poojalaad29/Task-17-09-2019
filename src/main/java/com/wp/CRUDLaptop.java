package com.wp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDLaptop {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
	    SessionFactory sf=config.buildSessionFactory();
	    Session session=sf.openSession();
	    Transaction tr=session.beginTransaction();
	    
	   /* Laptop laptop=new Laptop();
	    laptop.setCode("L116");
       laptop.setBrand("HCL");
       laptop.setPrice(80000);    
       session.save(laptop);
   
    tr.commit();
    System.out.println("Inserted Successfully");
    System.out.println("=============================================================");
    
	    /*Laptop laptop=new Laptop("L115");
	    session.delete(laptop);
	    
	    tr.commit();
	    System.out.println("Laptop deleted");
	   */ 
	    System.out.println("Update row");
	    Laptop laptop=session.get(Laptop.class,"L114");
	    laptop.setBrand("Lenovo");
	    session.update(laptop);
	    tr.commit();
	    System.out.println("Updated");

	}

}
