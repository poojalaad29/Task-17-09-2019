package com.wp;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ViewAllTables {
	public static void main(String []args) {
		Configuration config=new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Criteria criteria = session.createCriteria(Project.class);
		List<Project> projects = criteria.list();

		for (Project project : projects) {
			System.out.println("PCode  : " + project.getPcode());
			System.out.println("Title  : " + project.getPtitle());
			System.out.println("PrDur  : " + project.getDuration());
			System.out.println("______________________________________________");
		}
		

		Criteria criteria1 = session.createCriteria(Emp.class);
		List<Emp> emp = criteria1.list();

		for (Emp emp1 : emp) {
			System.out.println("Eno  : " +emp1.getEno());
			System.out.println("Name  : " + emp1.getEname());
			System.out.println("Salary  : " +emp1.getSal());
			System.out.println("______________________________________________");
		}
  
		Criteria criteria2 = session.createCriteria(Vehicle.class);
		List<Vehicle> vehicle = criteria2.list();

		for (Vehicle veh : vehicle) {
			System.out.println("Regno  : " +veh.getRegno());
			System.out.println("Brand : " +veh.getBrand());
			System.out.println("Model  : " +veh.getModel());
			System.out.println("______________________________________________");
		}
		
		Criteria criteria3 = session.createCriteria(Laptop.class);
		List<Laptop> lap = criteria3.list();

		for (Laptop laptop : lap) {
			System.out.println("code  : " +laptop.getCode());
			System.out.println("Brand : " +laptop.getBrand());
			System.out.println("Model  : " +laptop.getPrice());
			System.out.println("______________________________________________");
		}
	}
	}

