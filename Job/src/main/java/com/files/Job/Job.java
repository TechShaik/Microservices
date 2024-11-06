package com.files.Job;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
     @Id
	private int job_id;
	private String job_role;
	private String location;
	private float salary;
	private int company_id;
	public int getJob_id() {
		return job_id;
	}
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	public String getJob_role() {
		return job_role;
	}
	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
 
	public Job(int job_id, String job_role, String location, float salary, int company_id) {
		super();
		this.job_id = job_id;
		this.job_role = job_role;
		this.location = location;
		this.salary = salary;
		this.company_id = company_id;
	}
	public Job() {
		super();
	}
	
}
