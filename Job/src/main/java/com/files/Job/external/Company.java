package com.files.Job.external; 
public class Company {
 	private int company_id;
     private String company_name;
     private float rating;
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Company(int company_id, String company_name, float rating) {
		super();
		this.company_id = company_id;
		this.company_name = company_name;
		this.rating = rating;
	}
	public Company() {
		super();
	}
     
 
}
