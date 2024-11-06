package com.files.Job;

 
import com.files.Job.external.Company;
import com.files.Job.external.Reveiw;

public class JobWithCompanyDto {
	private int job_id;
	private String job_role;
	private String location;
	private float salary;
     private Company company;
	 private Reveiw review;
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
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	 
	public void setReviews(Reveiw reviews) {
		this.review = reviews;
	}
	public Reveiw getReview() {
		return review;
	}
	public void setReview(Reveiw review) {
		this.review = review;
	}
     
}
