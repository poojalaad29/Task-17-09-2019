package com.wp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Emp {
      
	@Id
	private int eno;
	private String ename;
	private int sal;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	@OneToMany(mappedBy="emp")
	private List<Vehicle> vehicle=new ArrayList<Vehicle>();
	
	@ManyToMany
	private List<Project> projects=new ArrayList<Project>();
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public List<Vehicle> getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = getVehicle();
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Emp(int eno, String ename, int sal, Laptop laptop, List<Vehicle> vehicle) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
		this.vehicle = vehicle;
	}
	public Emp() {
		super();
	}
	
	public Emp(int eno) {
		super();
		this.eno = eno;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", sal=" + sal + ", laptop=" + laptop + ", vehicle=" + vehicle
				+ "]";
	}
	public Emp(int eno, String ename, int sal, Laptop laptop) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
		this.laptop = laptop;
	}
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
}
