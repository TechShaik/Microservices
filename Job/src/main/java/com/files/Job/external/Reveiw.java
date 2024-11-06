package com.files.Job.external;

 
public class Reveiw {
 private int company_id;
 private String description; 
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Reveiw(int id, int company_id, String description) {
	super();
 	this.company_id = company_id;
	this.description = description;
}
public Reveiw() {
	super();
}
 
}
